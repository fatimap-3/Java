package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    private TextField firstOperandField;
    private TextField secondOperandField;
    private TextField resultField;

    @Override
    public void start(Stage primaryStage) {
    
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        firstOperandField = new TextField();
        secondOperandField = new TextField();
        resultField = new TextField();
        resultField.setEditable(false);
        Button addButton = new Button("Add");
        Button subtractButton = new Button("Subtract");
        Button clearButton = new Button("Clear");
        addButton.setOnAction(e -> performOperation('+'));
        subtractButton.setOnAction(e -> performOperation('-'));
        clearButton.setOnAction(e -> clearFields());
        gridPane.add(firstOperandField, 0, 0);
        gridPane.add(secondOperandField, 1, 0);
        gridPane.add(resultField, 2, 0);
        gridPane.add(addButton, 0, 1);
        gridPane.add(subtractButton, 1, 1);
        gridPane.add(clearButton, 2, 1);
        Scene scene = new Scene(gridPane, 300, 100);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void performOperation(char operator) {
        try {
            double firstOperand = Double.parseDouble(firstOperandField.getText());
            double secondOperand = Double.parseDouble(secondOperandField.getText());
            double result = 0;

            if (operator == '+') {
                result = firstOperand + secondOperand;
            } else if (operator == '-') {
                result = firstOperand - secondOperand;
            }

            resultField.setText(Double.toString(result));
        } catch (NumberFormatException e) {
            resultField.setText("Error");
        }
    }

    private void clearFields() {
        firstOperandField.clear();
        secondOperandField.clear();
        resultField.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

