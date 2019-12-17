package com.bulletinboard;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *SERVICE TO GENERATE A SERVICE CLASS OR STUB
 *WITH ITS RPC METHODS AND RESPECTIVE ARGUMENTS
 *gRPC REQUESTS AND RESPONSES TYPES.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: BulletinBoard.proto")
public final class BulletinBoardGrpc {

  private BulletinBoardGrpc() {}

  public static final String SERVICE_NAME = "com.bulletinboard.BulletinBoard";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.Post,
      com.bulletinboard.ServerResponse> getPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "post",
      requestType = com.bulletinboard.Post.class,
      responseType = com.bulletinboard.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bulletinboard.Post,
      com.bulletinboard.ServerResponse> getPostMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.Post, com.bulletinboard.ServerResponse> getPostMethod;
    if ((getPostMethod = BulletinBoardGrpc.getPostMethod) == null) {
      synchronized (BulletinBoardGrpc.class) {
        if ((getPostMethod = BulletinBoardGrpc.getPostMethod) == null) {
          BulletinBoardGrpc.getPostMethod = getPostMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.Post, com.bulletinboard.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BulletinBoard", "post"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.Post.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.ServerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BulletinBoardMethodDescriptorSupplier("post"))
                  .build();
          }
        }
     }
     return getPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.RequestPost,
      com.bulletinboard.ServerResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.bulletinboard.RequestPost.class,
      responseType = com.bulletinboard.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bulletinboard.RequestPost,
      com.bulletinboard.ServerResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.RequestPost, com.bulletinboard.ServerResponse> getGetMethod;
    if ((getGetMethod = BulletinBoardGrpc.getGetMethod) == null) {
      synchronized (BulletinBoardGrpc.class) {
        if ((getGetMethod = BulletinBoardGrpc.getGetMethod) == null) {
          BulletinBoardGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.RequestPost, com.bulletinboard.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BulletinBoard", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.RequestPost.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.ServerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BulletinBoardMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.RequestPostList,
      com.bulletinboard.Post> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "list",
      requestType = com.bulletinboard.RequestPostList.class,
      responseType = com.bulletinboard.Post.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bulletinboard.RequestPostList,
      com.bulletinboard.Post> getListMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.RequestPostList, com.bulletinboard.Post> getListMethod;
    if ((getListMethod = BulletinBoardGrpc.getListMethod) == null) {
      synchronized (BulletinBoardGrpc.class) {
        if ((getListMethod = BulletinBoardGrpc.getListMethod) == null) {
          BulletinBoardGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.RequestPostList, com.bulletinboard.Post>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BulletinBoard", "list"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.RequestPostList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.Post.getDefaultInstance()))
                  .setSchemaDescriptor(new BulletinBoardMethodDescriptorSupplier("list"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.RequestPost,
      com.bulletinboard.ServerResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.bulletinboard.RequestPost.class,
      responseType = com.bulletinboard.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bulletinboard.RequestPost,
      com.bulletinboard.ServerResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.RequestPost, com.bulletinboard.ServerResponse> getDeleteMethod;
    if ((getDeleteMethod = BulletinBoardGrpc.getDeleteMethod) == null) {
      synchronized (BulletinBoardGrpc.class) {
        if ((getDeleteMethod = BulletinBoardGrpc.getDeleteMethod) == null) {
          BulletinBoardGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.RequestPost, com.bulletinboard.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BulletinBoard", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.RequestPost.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.ServerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BulletinBoardMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BulletinBoardStub newStub(io.grpc.Channel channel) {
    return new BulletinBoardStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BulletinBoardBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BulletinBoardBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BulletinBoardFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BulletinBoardFutureStub(channel);
  }

  /**
   * <pre>
   *SERVICE TO GENERATE A SERVICE CLASS OR STUB
   *WITH ITS RPC METHODS AND RESPECTIVE ARGUMENTS
   *gRPC REQUESTS AND RESPONSES TYPES.
   * </pre>
   */
  public static abstract class BulletinBoardImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Accept all incoming posts from all connected clients.
     * </pre>
     */
    public void post(com.bulletinboard.Post request,
        io.grpc.stub.StreamObserver<com.bulletinboard.ServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request a post from server by name
     * </pre>
     */
    public void get(com.bulletinboard.RequestPost request,
        io.grpc.stub.StreamObserver<com.bulletinboard.ServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Display all posts in bolleting to the client.
     * </pre>
     */
    public void list(com.bulletinboard.RequestPostList request,
        io.grpc.stub.StreamObserver<com.bulletinboard.Post> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request to delete a post from server
     * </pre>
     */
    public void delete(com.bulletinboard.RequestPost request,
        io.grpc.stub.StreamObserver<com.bulletinboard.ServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bulletinboard.Post,
                com.bulletinboard.ServerResponse>(
                  this, METHODID_POST)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bulletinboard.RequestPost,
                com.bulletinboard.ServerResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bulletinboard.RequestPostList,
                com.bulletinboard.Post>(
                  this, METHODID_LIST)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bulletinboard.RequestPost,
                com.bulletinboard.ServerResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   *SERVICE TO GENERATE A SERVICE CLASS OR STUB
   *WITH ITS RPC METHODS AND RESPECTIVE ARGUMENTS
   *gRPC REQUESTS AND RESPONSES TYPES.
   * </pre>
   */
  public static final class BulletinBoardStub extends io.grpc.stub.AbstractStub<BulletinBoardStub> {
    private BulletinBoardStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BulletinBoardStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulletinBoardStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BulletinBoardStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accept all incoming posts from all connected clients.
     * </pre>
     */
    public void post(com.bulletinboard.Post request,
        io.grpc.stub.StreamObserver<com.bulletinboard.ServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request a post from server by name
     * </pre>
     */
    public void get(com.bulletinboard.RequestPost request,
        io.grpc.stub.StreamObserver<com.bulletinboard.ServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Display all posts in bolleting to the client.
     * </pre>
     */
    public void list(com.bulletinboard.RequestPostList request,
        io.grpc.stub.StreamObserver<com.bulletinboard.Post> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request to delete a post from server
     * </pre>
     */
    public void delete(com.bulletinboard.RequestPost request,
        io.grpc.stub.StreamObserver<com.bulletinboard.ServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *SERVICE TO GENERATE A SERVICE CLASS OR STUB
   *WITH ITS RPC METHODS AND RESPECTIVE ARGUMENTS
   *gRPC REQUESTS AND RESPONSES TYPES.
   * </pre>
   */
  public static final class BulletinBoardBlockingStub extends io.grpc.stub.AbstractStub<BulletinBoardBlockingStub> {
    private BulletinBoardBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BulletinBoardBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulletinBoardBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BulletinBoardBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accept all incoming posts from all connected clients.
     * </pre>
     */
    public com.bulletinboard.ServerResponse post(com.bulletinboard.Post request) {
      return blockingUnaryCall(
          getChannel(), getPostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request a post from server by name
     * </pre>
     */
    public com.bulletinboard.ServerResponse get(com.bulletinboard.RequestPost request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Display all posts in bolleting to the client.
     * </pre>
     */
    public java.util.Iterator<com.bulletinboard.Post> list(
        com.bulletinboard.RequestPostList request) {
      return blockingServerStreamingCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request to delete a post from server
     * </pre>
     */
    public com.bulletinboard.ServerResponse delete(com.bulletinboard.RequestPost request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *SERVICE TO GENERATE A SERVICE CLASS OR STUB
   *WITH ITS RPC METHODS AND RESPECTIVE ARGUMENTS
   *gRPC REQUESTS AND RESPONSES TYPES.
   * </pre>
   */
  public static final class BulletinBoardFutureStub extends io.grpc.stub.AbstractStub<BulletinBoardFutureStub> {
    private BulletinBoardFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BulletinBoardFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulletinBoardFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BulletinBoardFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accept all incoming posts from all connected clients.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bulletinboard.ServerResponse> post(
        com.bulletinboard.Post request) {
      return futureUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request a post from server by name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bulletinboard.ServerResponse> get(
        com.bulletinboard.RequestPost request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request to delete a post from server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bulletinboard.ServerResponse> delete(
        com.bulletinboard.RequestPost request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BulletinBoardImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BulletinBoardImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST:
          serviceImpl.post((com.bulletinboard.Post) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.ServerResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.bulletinboard.RequestPost) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.ServerResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.bulletinboard.RequestPostList) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.Post>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.bulletinboard.RequestPost) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.ServerResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BulletinBoardBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BulletinBoardBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bulletinboard.BulletinBoardOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BulletinBoard");
    }
  }

  private static final class BulletinBoardFileDescriptorSupplier
      extends BulletinBoardBaseDescriptorSupplier {
    BulletinBoardFileDescriptorSupplier() {}
  }

  private static final class BulletinBoardMethodDescriptorSupplier
      extends BulletinBoardBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BulletinBoardMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BulletinBoardGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BulletinBoardFileDescriptorSupplier())
              .addMethod(getPostMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
