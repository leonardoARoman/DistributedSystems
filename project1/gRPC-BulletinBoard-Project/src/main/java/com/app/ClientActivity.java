package com.app;

import com.controller.ClientController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ClientActivity extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/com/view/window.client.fxml"));
		AnchorPane root = (AnchorPane)loader.load();


		ClientController serverController = 
				loader.getController();
		serverController.start(primaryStage);

		Scene scene = new Scene(root,600,600);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
