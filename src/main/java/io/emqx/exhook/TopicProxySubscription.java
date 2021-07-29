package io.emqx.exhook;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

import cn.hutool.json.JSONObject;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TopicProxySubscription implements Runnable {

    // Block queue for consumer mode
    public static final LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
    private final Map<String, Integer> retryLimit = new HashMap<>();
    private final String url = "http://localhost:8081/api/v4/mqtt/subscribe";
    private OkHttpClient client = new OkHttpClient();
    private final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    @Override
    public void run() {
        String clientId = null;
        while (true) {
            try {
                clientId = queue.take();
                send(clientId);
            } catch (Exception e) {
                // add to tail
                if (retryLimit.get(clientId) < 3) {
                    queue.offer(clientId);
                    retryLimit.put(clientId, retryLimit.get(clientId) + 1);
                }
            }
        }
    }

    private void send(String clientId) throws IOException {
        String proxyTopics = generateProxyTopics(clientId);
        JSONObject json = new JSONObject();
        json.set("topics", proxyTopics);
        json.set("clientid", clientId);
        RequestBody body = RequestBody.create(JSON, json.toString());
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            throw new IOException("Response error with http code " + response.code());
        }
    }

    private static final String CLIENTID_SESSION_REDIS_KEY = "clientIdSessionHashKey";
    private static final String TOPIC_TEMPLATE = "das/iot/+1/+2/info/post_reply,das/iot/+1/+2/ota/request,das/iot/+1/+2/property/+/post_reply,das/iot/+1/+2/event/+/post_reply,das/iot/+1/+2/service/+/request,das/sys/+1/getDeviceId/response,das/iot/+1/+2/sub/batch/post_reply,das/iot/+1/+2/sub/service/request,das/iot/+1/+2/sub/topo/add,das/iot/+1/+2/sub/topo/remove,das/iot/+1/+2/sub/topo/get,das/iot/+1/+2/sub/login_reply,das/iot/+1/+2/sub/logout_reply,das/iot/+1/+2/sub/disable,das/iot/+1/+2/sub/enable,das/iot/+1/+2/bridge/login_reply,das/iot/+1/+2/bridge/logout_reply,das/iot/+1/+2/bridge/dis_connect";

    private String generateProxyTopics(String clientId) {
        String sessionId = ExServer.jedisPool.getResource().hget(CLIENTID_SESSION_REDIS_KEY, clientId);
        String[] arr = sessionId.split("&");
        return TOPIC_TEMPLATE.replaceAll("\\+1", arr[1]).replaceAll("\\+2", arr[0]);
    }

}
