package com.example.calcfx;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    private final Calculator calculator = new Calculator();
    private final Equation equation = new Equation();
    private final TextField display;
    private String currentInput = "0";

    public CalculatorController(TextField display){
        this.display = display;
    }

    public void handleClick(ActionEvent e){
        Button clickedBtn = (Button) e.getSource();
        String digit = clickedBtn.getText();

        if(currentInput.equals("0")){
            currentInput = digit;
        } else {
            currentInput += digit;
        }

        display.setText(currentInput);
    }

    public void handleOperator(ActionEvent e){
        Button clickedBtn = (Button) e.getSource();
        equation.first = currentInput;
        equation.operator = clickedBtn.getText();
        currentInput = "0";
    }

    public void handleEquals(ActionEvent e){
        equation.second = currentInput;

        double num1 = Double.parseDouble(equation.first);
        double num2 = Double.parseDouble(equation.second);
        double result;

        switch (equation.operator) {
            case "+" -> result = calculator.add(num1, num2);
            case "-" -> result = calculator.subtract(num1, num2);
            case "*" -> result = calculator.multiply(num1, num2);
            case "/" -> result = calculator.divide(num1, num2);
            default  -> result = Double.NaN;
        }

        if (Double.isNaN(result)) {
            display.setText("Error");
            currentInput = "0";
        } else {
            display.setText(String.valueOf(result));
            currentInput = String.valueOf(result);
        }

        equation.first = "";
        equation.operator = "";
        equation.second = "";
    }

    public void handleClear(ActionEvent e){
        currentInput = "0";
        equation.first = "";
        equation.operator = "";
        equation.second = "";
        display.setText(currentInput);
    }
}
