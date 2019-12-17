package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import com.bulletinboard.BulletinBoardGrpc;
import com.bulletinboard.Post;
import com.bulletinboard.RequestPost;
import com.bulletinboard.RequestPostList;
import com.bulletinboard.ServerResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ClientController {
	@FXML
	private TextField post;
	@FXML
	private TextArea body;
	@FXML
	private TextArea bodyContent;
	@FXML
	private ListView<String> postList;
	private ObservableList<String> observer;
	private final String localhost = "localhost";
	private final String url = "172.31.129.109";
	private BulletinBoardGrpc.BulletinBoardBlockingStub stub;

	public void start(Stage primaryStage) throws ClassNotFoundException, IOException {
		ManagedChannel channel = ManagedChannelBuilder
				.forTarget(localhost+":8080")
				.usePlaintext(true)
				.build();
		stub = BulletinBoardGrpc.newBlockingStub(channel);
		displayPosts();
	}

	private void displayPosts() {
		ArrayList<String> posts = new ArrayList<String>();
		Iterator<Post> response = stub.list(RequestPostList
				.newBuilder()
				.build());
		while(response.hasNext()) {
			Post post = response.next();
			posts.add(post.getTitle());
		}

		observer = FXCollections.observableArrayList(posts);
		postList.setItems(observer);
		postList.getSelectionModel()
		.selectedIndexProperty()
		.addListener((obs, oldVal, newVal)-> getBody());
	}

	private void getBody() {
		String delim = ":\"";
		String title = postList.getSelectionModel().getSelectedItem();
		System.out.print("Enter post title: "+title);
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
		bodyContent.setText(post[3]);
		System.out.println("\n"+post[2]+"\n\t|_"+post[3]+"\n");
	}
	public void makePost() {
		String p = post.getText();
		String b = body.getText();

		System.out.println("Create a new post...");
		System.out.println("Post title: "+p);
		System.out.print("Enter post body: "+b);
		ServerResponse response = stub.post(Post.newBuilder()
				.setTitle(p)
				.setBody(b)
				.build());
		System.out.println("\n****************************************\n");
		System.out.println(response);
		System.out.println("****************************************");
		post.clear();
		body.clear();
		displayPosts();
	}

	public void deletePost() {
		String item = postList.getSelectionModel().getSelectedItem();
		System.out.print("Enter post title: "+item);
		ServerResponse response = stub.delete(RequestPost.newBuilder()
				.setTitle(item)
				.build());
		System.out.println("\n********************************\n");
		System.out.println(response);
		System.out.println("********************************");
		displayPosts();
	}
}
