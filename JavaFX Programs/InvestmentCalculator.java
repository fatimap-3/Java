package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InvestmentCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Future Value Calculator");

        Label lblInvestmentAmount = new Label("Investment Amount = ");
        TextField txtInvestmentAmount = new TextField();

        Label lblYears = new Label("Number of Years = ");
        TextField txtYears = new TextField();

        Label lblAnnualInterestRate = new Label("Annual Interest Rate (%) = ");
        TextField txtAnnualInterestRate = new TextField();

        Button btnCalculate = new Button("Calculate");
        Label lblFutureValue = new Label("");

        btnCalculate.setOnAction(e -> {
            try {
                double investmentAmount = Double.parseDouble(txtInvestmentAmount.getText());
                int years = Integer.parseInt(txtYears.getText());
                double annualInterestRate = Double.parseDouble(txtAnnualInterestRate.getText());

                double futureValue = calculateFutureValue(investmentAmount, years, annualInterestRate);
                lblFutureValue.setText(String.format("Future Value = $%.2f", futureValue));
            } catch (NumberFormatException ex) {
                lblFutureValue.setText("Please enter the values ");
            }
        });

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(5);

        gridPane.add(lblInvestmentAmount, 0, 0);
        gridPane.add(txtInvestmentAmount, 1, 0);
        gridPane.add(lblYears, 0, 1);
        gridPane.add(txtYears, 1, 1);
        gridPane.add(lblAnnualInterestRate, 0, 2);
        gridPane.add(txtAnnualInterestRate, 1, 2);
        gridPane.add(btnCalculate, 0, 3);
        gridPane.add(lblFutureValue, 1, 3);

        VBox vbox = new VBox(gridPane);
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private double calculateFutureValue(double investmentAmount, int years, double annualInterestRate) {
        return investmentAmount * Math.pow(1 + annualInterestRate / 100, years);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
