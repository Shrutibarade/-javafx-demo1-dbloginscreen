package org.dnyanyog;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ActorOnStage extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    
    public void start(Stage stage) throws Exception {
        
        stage.setTitle("Text Learn");

        
        Text actorText = new Text();
        actorText.setText("Hello World!!");
        actorText.setFont(Font.font("Verdana", 50));
        actorText.setFill(Color.WHITE);
        actorText.setX(50);
        actorText.setY(50);

        
        Line actorLine = new Line();
        actorLine.setStroke(Color.WHITE);
        actorLine.setStrokeWidth(5);
        actorLine.setStartX(60);
        actorLine.setStartY(60);
        actorLine.setEndX(370);
        actorLine.setEndY(60);

       
        Rectangle actorRect = new Rectangle();
        actorRect.setFill(Color.WHITE);
        actorRect.setX(80);
        actorRect.setY(80);
        actorRect.setWidth(250);
        actorRect.setHeight(250);

        
        Group actorGroup = new Group();
        actorGroup.getChildren().addAll(actorText, actorLine, actorRect);

        
        Scene scene = new Scene(actorGroup, 500, 400, Color.RED);

       
        stage.setScene(scene);
        stage.show();
    }
}
