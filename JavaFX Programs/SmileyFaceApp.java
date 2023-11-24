package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SmileyFaceApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Circle face = new Circle(150, 150, 100);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.BLACK);

        Circle leftEye = new Circle(120, 115, 15);
        leftEye.setFill(Color.BLACK);

        Circle rightEye = new Circle(180, 115, 15);
        rightEye.setFill(Color.BLACK);

        Ellipse smile = new Ellipse(150, 180, 50, 30);
        smile.setFill(Color.TRANSPARENT);
        smile.setStroke(Color.BLACK);

        Line nose = new Line(150, 130, 150, 150);
        nose.setStroke(Color.BLACK);

        Text label = new Text(100, 280, "Smiley Face");
        label.setFont(new Font(20));

        pane.getChildren().addAll(face, leftEye, rightEye, smile, nose, label);

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Smiley Face");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

