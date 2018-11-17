package com.bulletinboard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

import io.grpc.stub.StreamObserver;
/**
 * 
 * @author Roman
 * BulletingBoardService class is the server stub 
 * needed for server and client classes.
 */
public class BulletinBoardService extends 
BulletinBoardGrpc.BulletinBoardImplBase {

	private static Collection<Post> clientPosts;
	private static ArrayList<String> posts;
	private final static String url = "./src/postFile.dat";
	/*
	private static PostList postList;
	private static int clientNumber = 0;
	private static int postNumber = 0;
	 */
	public BulletinBoardService() {
		clientPosts = new ArrayList<Post>();
		posts = new ArrayList<String>();
		//clientNumber++;
		//postList = PostList.newBuilder().build();
	}

	@Override
	public void post(Post request, 
			StreamObserver<ServerResponse> responseObserver) {

		//postNumber++;
		clientPosts.add(request);
		posts.add(request.getTitle());
		try {
			// Save the current List in a binary serialize file.
			savePosts(clientPosts);
		} catch (IOException e) {
			e.printStackTrace();
		}

		ServerResponse response = ServerResponse
				.newBuilder()
				.setMessage("Post successfully submitted!")
				.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void get(RequestPost request,
			StreamObserver<ServerResponse> responseObserver) {

		ServerResponse response;
		Post post = findPost(request);

		if(post == null) {
			response = ServerResponse
					.newBuilder()
					.setMessage("Post does not exist")
					.build();
		}else {
			response = ServerResponse
					.newBuilder()
					.setMessage(post.getTitle()+": "+post.getBody())
					.build();
		}
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void list(RequestPostList request, 
			StreamObserver<Post> responseObserver) {
		try {
			clientPosts = deserialize();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Post post: clientPosts) {
			responseObserver.onNext(post);
		}
		responseObserver.onCompleted();
	}

	@Override
	public void delete (RequestPost request,
			StreamObserver<ServerResponse> responseObserver) {
		ServerResponse response;
		Post post = findPost(request);

		if(post == null) {
			response = ServerResponse
					.newBuilder()
					.setMessage("Post does not exist")
					.build();
		}else {
			clientPosts.remove(post);
			try {
				savePosts(clientPosts);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response = ServerResponse
					.newBuilder()
					.setMessage("Post deleted")
					.build();
		}
	
		responseObserver.onNext(response);
		responseObserver.onCompleted();	
	}

	private static Post findPost(RequestPost request) {
		for(Post post: clientPosts) {
			if(request.getTitle().equals(post.getTitle())) {
				return post;
			}
		}
		return null;
	}

	private static void savePosts(Collection<Post> clientPosts2) throws IOException {
		ObjectOutputStream oos = null;
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(url);
			oos = new ObjectOutputStream(fout);
			oos.writeObject(clientPosts2);
		} catch ( IOException e ) {
			e.printStackTrace();
		} finally {
			if (oos != null){
				oos.close();
			}
		}
	}

	private static ArrayList<Post> deserialize() throws IOException, ClassNotFoundException{
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(url);
			ois = new ObjectInputStream(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList<Post> alp = (ArrayList<Post>)ois.readObject();
		return alp;
	}
}