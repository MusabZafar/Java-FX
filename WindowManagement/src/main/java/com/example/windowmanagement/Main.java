package com.example.windowmanagement;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		firstWindow();
	}

	public void firstWindow(){
		System.out.println("First Window Method");

		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("FirstWindowView.fxml"));
			AnchorPane pane = loader.load();
			FirstWindowController firstWindowController = loader.getController();
			firstWindowController.setMain(this);

			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void newWindow(){
		System.out.println("new Window Method");
		System.out.println("Main"+this);

		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("NewWindowView.fxml"));
			AnchorPane pane = loader.load();

			Scene scene = new Scene(pane);

			NewWindowController newWindowController = loader.getController();
			newWindowController.setMain(this);

			Stage secondaryStage = new Stage();
			secondaryStage.initOwner(primaryStage);
			secondaryStage.initModality(Modality.WINDOW_MODAL);

			secondaryStage.setScene(scene);
			secondaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	public void changeToSecondWindow(){
		System.out.println("Second Window Method");
		System.out.println("Main"+this);

		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("SecondWindowView.fxml"));
			AnchorPane pane = loader.load();

			Scene scene = new Scene(pane);

			SecondWindowController secondWindowController = loader.getController();
			secondWindowController.setMain(this);

			//Stage secondaryStage = new Stage();
			//secondaryStage.initOwner(primaryStage);
			//secondaryStage.initModality(Modality.WINDOW_MODAL);

			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public static void main(String[] args) {
		launch(args);
	}
}
