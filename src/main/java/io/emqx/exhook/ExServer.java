/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.emqx.exhook;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.kafka.clients.producer.KafkaProducer;

import io.emqx.exhook.verifier.TimestampSignVerifier;
import io.emqx.exhook.verifier.Verifier;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class ExServer {
    private static final Logger logger = Logger.getLogger(ExServer.class.getName());

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 9000;

        server = ServerBuilder.forPort(port).addService(initHookProvider()).build().start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown
                // hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try {
                    ExServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
        initMiddleware();
    }

    private HookProviderImpl initHookProvider() {
        HookProviderImpl hookProvider = new HookProviderImpl();
        List<Verifier> verifiers = new ArrayList<>();
        verifiers.add(new TimestampSignVerifier());
        hookProvider.setVerifiers(verifiers);
        return hookProvider;
    }

    public static JedisPool jedisPool;
    public static ThreadPoolExecutor threadPool;

    private void initMiddleware() throws UnknownHostException {
        // init redis client
        jedisPool = new JedisPool(new JedisPoolConfig(), "10.20.28.230", 6379);
        // init kafka client
        // Properties config = new Properties();
        // config.put("client.id", "kp45-exhook");
        // config.put("bootstrap.servers", "10.20.178.140:9092");
        // config.put("acks", "all");
        // config.put("key.serializer", "");
        // new KafkaProducer<>(config);
        // init thread pool
        int threadPoolSize = 8;
        threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(threadPoolSize);
        for (int i = 0; i < threadPool.getPoolSize(); i++) {
            threadPool.execute(new TopicProxySubscription());
        }
        logger.info("Init thread pool with size " + threadPool.getActiveCount());
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon
     * threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final ExServer server = new ExServer();
        server.start();
        server.blockUntilShutdown();
    }
}
