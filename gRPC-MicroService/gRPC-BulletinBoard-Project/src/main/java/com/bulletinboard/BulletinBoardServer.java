package com.bulletinboard;

import java.io.IOException;
import java.net.InetAddress;

import io.grpc.Server;
import io.grpc.ServerBuilder;


public class BulletinBoardServer {
	
	public static void main(String[] args) 
			throws IOException, InterruptedException {

		// TODO Auto-generated method stub
		System.out.println(InetAddress.getLocalHost());
		Server server = ServerBuilder.forPort(8080)
				.addService(new BulletinBoardService())
				.build();
		server.start();
		System.out.println("Server listenning on port "+server.getPort()+"...");
		server.awaitTermination();

	}
}
