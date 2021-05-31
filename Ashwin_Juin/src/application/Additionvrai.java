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
		Button bouton = new Button();
		TextField txt1 = new TextField();
		txt1.setLayoutX(50);
		txt1.setLayoutY(20);
		TextField txt2 = new TextField();
		txt2.setLayoutX(50);
		txt2.setLayoutY(60);
		Label lbl1 = new Label();
		lbl1.setLayoutX(50);
		lbl1.setLayoutY(80);
		Label lblplus = new Label();
		lblplus.setLayoutX(50);
		lblplus.setLayoutY(80);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
