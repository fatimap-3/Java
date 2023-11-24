package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ImageFlowPaneApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10));
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        Font labelFont = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
        String[] imageFiles = {
            "\"C:\\Users\\Fatima Patel\\OneDrive\\Desktop\\323456.jpeg\"",  
            "\"C:\\Users\\Fatima Patel\\OneDrive\\Desktop\\3456789.jpeg\"", 
            "\"C:\\Users\\Fatima Patel\\OneDrive\\Desktop\\678456789.jpeg\""
          
        };

        for (String imageFile : imageFiles) {
            Image image = new Image(imageFile);
            ImageView imageView = new ImageView(image);
            Label label = new Label("Label for " + imageFile);
            label.setFont(labelFont);
            flowPane.getChildren().addAll(imageView, label);
        }

       
        Scene scene = new Scene(flowPane, 600, 400);

        // Set the stage title and scene, then show the stage
        primaryStage.setTitle("Image FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
