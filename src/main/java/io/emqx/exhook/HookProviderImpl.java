package io.emqx.exhook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.HmacUtils;

import io.emqx.exhook.verifier.Verifier;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import io.grpc.stub.StreamObserver;
import redis.clients.jedis.Jedis;

public class HookProviderImpl extends HookProviderGrpc.HookProviderImplBase {
    private List<Verifier> verifiers = new ArrayList<>();

    @Override
    public void onProviderLoaded(ProviderLoadedRequest request, StreamObserver<LoadedResponse> responseObserver) {
        HookSpec[] specs = { HookSpec.newBuilder().setName("client.connected").build(),
                HookSpec.newBuilder().setName("client.disconnected").build(),
                HookSpec.newBuilder().setName("client.authenticate").build() };
        LoadedResponse reply = LoadedResponse.newBuilder().addAllHooks(Arrays.asList(specs)).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onProviderUnloaded(ProviderUnloadedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onClientConnected(ClientConnectedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        TopicProxySubscription.queue.offer(request.getClientinfo().getClientid());
        responseObserver.onCompleted();
    }

    @Override
    public void onClientDisconnected(ClientDisconnectedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onClientAuthenticate(ClientAuthenticateRequest request,
            StreamObserver<ValuedResponse> responseObserver) {
        boolean passed = false;
        for (Verifier verifier : verifiers) {
            passed = verifier.verify(request.getClientinfo());
            if (passed)
                break;
        }
        ValuedResponse reply = ValuedResponse.newBuilder().setBoolResult(passed)
                .setType(ValuedResponse.ResponsedType.STOP_AND_RETURN).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    public void setVerifiers(List<Verifier> verifiers) {
        this.verifiers = verifiers;
    }

}
