package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Additionvrai extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Group group = new Group();
		Scene scene = new Scene(group,400,400);
		
		TextField txt1 = new TextField();
		txt1.setLayoutX(50);
		txt1.setLayoutY(20);
		
		txt1.setOnAction((event) -> 
		{
			System.out.println(txt1.getText());
		}
		);
		
		TextField txt2 = new TextField();
		txt2.setLayoutX(50);
		txt2.setLayoutY(60);
		
		txt2.setOnAction((event) -> 
		{
			System.out.println(txt2.getText());
		}
		);
		
		Button bouton = new Button();
		
		
		Label lbl1 = new Label();
		lbl1.setLayoutX(50);
		lbl1.setLayoutY(80);
		
		lbl1.setOnKeyPressed((event) ->
		{
			System.out.println(txt1.getText());
		}
		);
		
		Label lbl2 = new Label();
		lbl2.setLayoutX(55);
		lbl2.setLayoutY(80);
		
		lbl2.setOnKeyPressed((event) ->
		{
			System.out.println("+");
		}
		);
		
		Label lbl3 = new Label();
		lbl3.setLayoutX(60);
		lbl3.setLayoutY(80);
		
		lbl3.setOnKeyPressed((event) ->
		{
			System.out.println(txt2.getText());
		}
		);
		
		Label lbl4 = new Label();
		lbl4.setLayoutX(55);
		lbl4.setLayoutY(80);
		
		lbl4.setOnKeyPressed((event) ->
		{
			System.out.println("=");
		}
		);
		
		Label lblplus = new Label();
		lblplus.setLayoutX(50);
		lblplus.setLayoutY(80);
		
		Label lbl5 = new Label();
		lbl5.setLayoutX(60);
		lbl5.setLayoutY(80);
		
		lbl5.setOnKeyPressed((event) ->
		{
			System.out.println((txt2.getText())+(txt1.getText()));
		}
		);
		
		group.getChildren().add(txt1);
		group.getChildren().add(txt2);
		group.getChildren().add(lbl1);
		group.getChildren().add(lbl2);
		group.getChildren().add(lbl3);
		group.getChildren().add(lbl4);
		group.getChildren().add(lbl5);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
