package org.dnyanyog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginScreen extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Customer Login");

        // Load FXML file using the class loader
        Parent actorGroup = FXMLLoader.load(getClass().getResource("/LoginScreen.fxml"));

        // Set the scene
        Scene scene = new Scene(actorGroup, 600, 400);

        // Show the stage
        stage.setScene(scene);
        stage.show();
    }
}
