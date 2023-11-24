package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class InsideRectangleApp extends Application {
    private Rectangle rectangle;
    private Label messageLabel;

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        // Create the fixed rectangle centered at (80, 50) with width 100 and height 30
        rectangle = new Rectangle(80 - 50, 50 - 15, 100, 30);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);

        // Create the label to display the message
        messageLabel = new Label("Move the mouse to check if it's inside the rectangle.");
        messageLabel.setLayoutX(10);
        messageLabel.setLayoutY(80);

        root.getChildren().addAll(rectangle, messageLabel);

        // Add mouse move event handler
        root.setOnMouseMoved(event -> {
            boolean isInside = rectangle.contains(event.getX(), event.getY());
            String message = isInside ? "Mouse is inside the rectangle." : "Mouse is outside the rectangle.";
            messageLabel.setText(message);
        });

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setTitle("Geometry: Inside a Rectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
