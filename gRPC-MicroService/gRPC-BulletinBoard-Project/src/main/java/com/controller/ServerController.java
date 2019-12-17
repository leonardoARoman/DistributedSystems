package com.controller;

import java.util.ArrayList;

import com.bulletinboard.BulletinBoardService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.ListView;


public class ServerController {
	@FXML
	private ListView<String> users;
	private ObservableList<String> obl;
	
	public void start(Stage primaryStage) {
		
	}
	
	public void refreshClients() {
		/*
		System.out.println("I was clicked!");
		ArrayList<String> list = BulletinBoardService.clients;
		for(String s: list) {
			System.out.println(s);
		}
		obl = FXCollections.observableArrayList(list);
		users.setItems(obl);
		*/
	}
}
