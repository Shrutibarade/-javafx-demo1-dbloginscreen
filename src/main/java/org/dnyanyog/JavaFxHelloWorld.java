package org.dnyanyog;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class JavaFxHelloWorld extends Application {
    public static void main(String[] args) {
        Application.launch(args); 
    }

    
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First Window");
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        Group actorGroup = new Group(); 
        Scene scene = new Scene(actorGroup,  Color.RED); 

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
