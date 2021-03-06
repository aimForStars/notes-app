package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Design.fxml"));
		Scene scene = new Scene(root, 300, 275);
	    
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		

	}

}
