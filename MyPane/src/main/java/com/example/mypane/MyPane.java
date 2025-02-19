package com.example.mypane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {


		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(4);
		dropShadow.setOffsetY(6);
		dropShadow.setColor(Color.rgb(150,50,50,.688));

		Pane pane = new Pane();
		pane.setPrefWidth(200);
		pane.setPrefHeight(200);

		Circle circle = new Circle(50,Color.BLUE);
		circle.relocate(50, 50);

		Rectangle square = new Rectangle(100,100,Color.RED);
		square.setArcHeight(30);
		square.setArcWidth(30);
		square.relocate(200, 50);

		pane.getChildren().addAll(circle,square);
		pane.setEffect(dropShadow);

		Scene scene = new Scene(pane,350,200,Color.LIGHTGREEN);
		primaryStage.setTitle("My Pane Example");
		primaryStage.setScene(scene);
		primaryStage.show();
	}



	public static void main(String[] args) {
	    Application.launch(args);
	}

}
