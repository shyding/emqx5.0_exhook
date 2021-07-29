package io.emqx.exhook.verifier;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.HmacUtils;

import io.emqx.exhook.ClientInfo;
import io.emqx.exhook.ExServer;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import redis.clients.jedis.Jedis;

public class TimestampSignVerifier implements Verifier {
    public boolean verify(ClientInfo clientinfo) {
        String clientId = clientinfo.getClientid();
        String username = clientinfo.getUsername();
        String password = clientinfo.getPassword();
        if (StringUtil.isNullOrEmpty(clientId) || StringUtil.isNullOrEmpty(username)
                || StringUtil.isNullOrEmpty(password)) {
            return false;
        }
        if (clientId.equals("transport_super") && username.equals("transport_root")) {
            return true;
        }
        if (clientId.startsWith("Emqx_Producer_") || clientId.equals("Emqx_Consumer_")) {
            return true;
        }

        String[] usernames = username.split("&");
        String devices = usernames[0];
        String thingId = usernames[1];
        String timestamp = usernames[2];
        List<String> deviceIds = Arrays.asList(devices.split(","));

        String deviceId = null;
        String thingSecret = null;
        String accessKey = null;
        Jedis jedis = ExServer.jedisPool.getResource();
        for (String id : deviceIds) {
            String key = id + "&" + thingId;
            if (jedis.exists(key)) {
                Map<String, String> keyMap = jedis.hgetAll(key);
                deviceId = id;
                thingSecret = keyMap.get("thingSecret");
                accessKey = keyMap.get("accessKey");
                break;
            }

        }

        if (StringUtil.isNullOrEmpty(deviceId) || StringUtil.isNullOrEmpty(thingSecret)
                || StringUtil.isNullOrEmpty(accessKey)) {
            return false;
        }

        return passwordCheck(password, devices, accessKey, thingId, thingSecret, timestamp, clientId);
    }

    private boolean passwordCheck(String password, String devices, String accessKey, String thingId, String thingSecret,
            String timestamp, String clientId) {
        String computePassword = null;
        String plaintext = "thingId" + thingId + "ID" + devices + "timestamp" + timestamp;
        String secureMode = parseSecureMode(clientId);
        if (secureMode.equals("1")) {
            computePassword = HmacUtils.hmacSha256Hex(plaintext, accessKey);
        } else if (secureMode.equals("2")) {
            computePassword = HmacUtils.hmacSha256Hex(plaintext, thingSecret);
        } else {
            throw new IllegalArgumentException("Unsupport secure mode " + secureMode);
        }
        return password.equalsIgnoreCase(computePassword);
    }

    private String parseSecureMode(String clientId) {
        List<String> mqttClientIdKv = Arrays.asList(clientId.split("\\|")[1].split(","));
        for (String kv : mqttClientIdKv) {
            String[] kvArray = kv.split("=");
            if (kvArray[0].equals("securemode")) {
                return kvArray[1];
            }
        }
        throw new IllegalArgumentException("Cannot find secure mode in " + clientId);
    }
}
