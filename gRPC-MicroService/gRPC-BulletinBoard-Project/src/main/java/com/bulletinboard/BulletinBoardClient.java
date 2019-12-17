package com.bulletinboard;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class BulletinBoardClient {
	private static Scanner stdin = new Scanner(System.in);
	
	private static void menu(BulletinBoardGrpc
			.BulletinBoardBlockingStub stub) {
		int key = 0;
		while(key != 5) {
			System.out.println("1. Get all Posts\n"
					+"2. Get a Post\n"
					+"3. Make a Post\n"
					+"4. Delete a Post\n"
					+"5. Quit");
			System.out.print("Select from options: ");
			key = stdin.nextInt();
			System.out.println();
			if(key == 1)
				listPosts(stub);
			else if(key == 2)
				findPost(stub);
			else if(key == 3)
				makeaPost(stub);
			else if(key == 4)
				deletePost(stub);
		}
	}
	private static void makeaPost(BulletinBoardGrpc
			.BulletinBoardBlockingStub stub) {
		System.out.println("Create a new post...");
		System.out.print("Enter post title: ");
		stdin.nextLine();
		String title = stdin.nextLine();
		System.out.print("Press any key!");
		stdin.nextLine();
		System.out.print("Enter post body: ");
		String body = stdin.nextLine();

		ServerResponse response = stub.post(Post.newBuilder()
				.setTitle(title)
				.setBody(body)
				.build());
		System.out.println("\n****************************************\n");
		System.out.println(response);
		System.out.println("****************************************");
	}

	private static void findPost(BulletinBoardGrpc
			.BulletinBoardBlockingStub stub) {
		String delim = ":\"";
		System.out.print("Enter post title: ");
		stdin.nextLine();
		String title = stdin.nextLine();
		ServerResponse response = stub.get(RequestPost.newBuilder()
				.setTitle(title)
				.build());
		String str = response.toString();
		StringTokenizer tokens = new StringTokenizer(str,delim);
		String[] post = new String[tokens.countTokens()];
		int i = 0;
		while(tokens.hasMoreTokens()) {
			post[i] = tokens.nextToken();
			i++;
		}
		System.out.println("\n"+post[2]+"\n\t|_"+post[3]+"\n");
	}

	private static void listPosts(BulletinBoardGrpc
			.BulletinBoardBlockingStub stub) {
		System.out.println("All posts...\n");
		Iterator<Post> response = stub.list(RequestPostList
				.newBuilder()
				.build());
		while(response.hasNext()) {
			Post post = response.next();
			System.out.println(post.getTitle()+"\n\t|_"+post.getBody());
		}
		System.out.println();
	}

	private static void deletePost(BulletinBoardGrpc
			.BulletinBoardBlockingStub stub) {
		System.out.print("Enter post title: ");
		stdin.nextLine();
		String title = stdin.nextLine();
		ServerResponse response = stub.delete(RequestPost.newBuilder()
				.setTitle(title)
				.build());
		System.out.println("\n********************************\n");
		System.out.println(response);
		System.out.println("********************************");
	}
	public static void main(String[] args) {
		String url = "172.31.129.109";
		String localHost = "localhost";
		ManagedChannel channel = ManagedChannelBuilder
				.forTarget(localHost+":8080")
				.usePlaintext(true)
				.build();
		BulletinBoardGrpc.BulletinBoardBlockingStub stub =
				BulletinBoardGrpc.newBlockingStub(channel);
		menu(stub);
	}
}
