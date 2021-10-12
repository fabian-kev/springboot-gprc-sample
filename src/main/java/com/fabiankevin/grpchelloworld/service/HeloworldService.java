package com.fabiankevin.grpchelloworld.service;

import com.fabiankevin.grpchelloworld.HelloReply;
import com.fabiankevin.grpchelloworld.HelloRequest;
import com.fabiankevin.grpchelloworld.MyServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HeloworldService extends MyServiceGrpc.MyServiceImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String name = request.getName();
        System.out.println("Name "+name);
        HelloReply helloReply = HelloReply.newBuilder()
                .setMessage(String.format("Konichiwa %s", name))
                .build();

        responseObserver.onNext(helloReply);
        responseObserver.onCompleted();
//        responseObserver.onError();
    }
}
