package io.kp45.exhook;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.protobuf.ByteString;

import io.emqx.exhook.ClientAuthenticateRequest;
import io.emqx.exhook.ClientConnackRequest;
import io.emqx.exhook.ClientConnectRequest;
import io.emqx.exhook.ClientConnectedRequest;
import io.emqx.exhook.ClientDisconnectedRequest;
import io.emqx.exhook.ClientSubscribeRequest;
import io.emqx.exhook.ClientUnsubscribeRequest;
import io.emqx.exhook.EmptySuccess;
import io.emqx.exhook.HookProviderGrpc;
import io.emqx.exhook.HookSpec;
import io.emqx.exhook.LoadedResponse;
import io.emqx.exhook.Message;
import io.emqx.exhook.MessageAckedRequest;
import io.emqx.exhook.MessageDeliveredRequest;
import io.emqx.exhook.MessageDroppedRequest;
import io.emqx.exhook.MessagePublishRequest;
import io.emqx.exhook.ProviderLoadedRequest;
import io.emqx.exhook.ProviderUnloadedRequest;
import io.emqx.exhook.SessionCreatedRequest;
import io.emqx.exhook.SessionDiscardedRequest;
import io.emqx.exhook.SessionResumedRequest;
import io.emqx.exhook.SessionSubscribedRequest;
import io.emqx.exhook.SessionTerminatedRequest;
import io.emqx.exhook.SessionUnsubscribedRequest;
import io.emqx.exhook.ValuedResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ExhookGrpcServer extends HookProviderGrpc.HookProviderImplBase {
    private static final Logger logger = LoggerFactory.getLogger(ExhookGrpcServer.class);

    @Autowired
    private Verifier verifier;

    @Override
    public void onProviderLoaded(ProviderLoadedRequest request, StreamObserver<LoadedResponse> responseObserver) {
        logger.info("onProviderLoaded:{}", request);
//        HookSpec[] specs = {
//                HookSpec.newBuilder().setName("client.authenticate").build(),
//        };
        LoadedResponse reply = LoadedResponse.newBuilder().addAllHooks(Arrays.asList( getHookSpec() )).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onProviderUnloaded(ProviderUnloadedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onProviderUnloaded:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onClientAuthenticate(ClientAuthenticateRequest request,
            StreamObserver<ValuedResponse> responseObserver) {
        logger.info("onClientAuthenticate:{}", request);
        boolean passed = verifier.verify(request.getClientinfo());
        ValuedResponse reply = ValuedResponse.newBuilder().setBoolResult(passed)
                .setType(ValuedResponse.ResponsedType.STOP_AND_RETURN).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    
    

    @Override
    public void onClientConnect(ClientConnectRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onClientConnect:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onClientConnack(ClientConnackRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onClientConnack:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onClientConnected(ClientConnectedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onClientConnected:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onClientDisconnected(ClientDisconnectedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onClientDisconnected:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }





    @Override
    public void onClientSubscribe(ClientSubscribeRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onClientSubscribe:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onClientUnsubscribe(ClientUnsubscribeRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onClientUnsubscribe:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onSessionCreated(SessionCreatedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onSessionCreated:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onSessionSubscribed(SessionSubscribedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onSessionSubscribed:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onSessionUnsubscribed(SessionUnsubscribedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onSessionUnsubscribed:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onSessionResumed(SessionResumedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onSessionResumed:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onSessionDiscarded(SessionDiscardedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onSessionDdiscarded:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

  

    @Override
    public void onSessionTerminated(SessionTerminatedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onSessionTerminated:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onMessagePublish(MessagePublishRequest request, StreamObserver<ValuedResponse> responseObserver) {
        logger.info("onMessagePublish:{}", request);

        ByteString bstr = ByteString.copyFromUtf8("hardcode payload by exhook-svr-java :)");

        Message nmsg = Message.newBuilder()
                              .setId     (request.getMessage().getId())
                              .setNode   (request.getMessage().getNode())
                              .setFrom   (request.getMessage().getFrom())
                              .setTopic  (request.getMessage().getTopic())
                              .setPayload(bstr).build();


        ValuedResponse reply = ValuedResponse.newBuilder()
                                             .setType(ValuedResponse.ResponsedType.STOP_AND_RETURN)
                                             .setMessage(nmsg).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

//case2: stop publish the 't/d' messages
//    @Override
//    public void onMessagePublish(MessagePublishRequest request, StreamObserver<ValuedResponse> responseObserver) {
//        logger.info("onMessagePublish", request);
//
//        Message nmsg = request.getMessage();
//        if ("t/d".equals(nmsg.getTopic())) {
//            ByteString bstr = ByteString.copyFromUtf8("");
//            nmsg = Message.newBuilder()
//                          .setId     (request.getMessage().getId())
//                          .setNode   (request.getMessage().getNode())
//                          .setFrom   (request.getMessage().getFrom())
//                          .setTopic  (request.getMessage().getTopic())
//                          .setPayload(bstr)
//                          .putHeaders("allow_publish", "false").build();
//        }
//
//        ValuedResponse reply = ValuedResponse.newBuilder()
//                                             .setType(ValuedResponse.ResponsedType.STOP_AND_RETURN)
//                                             .setMessage(nmsg).build();
//        responseObserver.onNext(reply);
//        responseObserver.onCompleted();
//    }

    @Override
    public void onMessageDelivered(MessageDeliveredRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onMessageDelivered:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onMessageAcked(MessageAckedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onMessageAcked:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void onMessageDropped(MessageDroppedRequest request, StreamObserver<EmptySuccess> responseObserver) {
        logger.info("onMessageDropped:{}", request);
        EmptySuccess reply = EmptySuccess.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    
    
    /**挂载所有的钩子
     * @return
     */
    public static HookSpec[] getHookSpec() {
    	
        HookSpec[] specs = {
                HookSpec.newBuilder().setName("client.connect").build(),
                HookSpec.newBuilder().setName("client.connack").build(),
                HookSpec.newBuilder().setName("client.connected").build(),
                HookSpec.newBuilder().setName("client.disconnected").build(),
                HookSpec.newBuilder().setName("client.authenticate").build(),
       
                HookSpec.newBuilder().setName("client.subscribe").build(),
                HookSpec.newBuilder().setName("client.unsubscribe").build(),

                HookSpec.newBuilder().setName("session.created").build(),
                HookSpec.newBuilder().setName("session.subscribed").build(),
                HookSpec.newBuilder().setName("session.unsubscribed").build(),
                HookSpec.newBuilder().setName("session.resumed").build(),
                HookSpec.newBuilder().setName("session.discarded").build(),
             
                HookSpec.newBuilder().setName("session.terminated").build(),

                HookSpec.newBuilder().setName("message.publish").build(),
                HookSpec.newBuilder().setName("message.delivered").build(),
                HookSpec.newBuilder().setName("message.acked").build(),
                HookSpec.newBuilder().setName("message.dropped").build()
        };
        
        return specs;
    }
}
