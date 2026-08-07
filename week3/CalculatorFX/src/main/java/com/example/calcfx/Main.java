package com.example.calcfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.List;

public class Main extends Application {
    public class Equation {
        String first;
        String operator;
        String second;
        String result;
    }

//    public class Btn extends Button {
//        Button btn;
//    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }

    private Equation equation = new Equation();
    private String currentInput = "0";
    private TextField display;

    public void handleClick(ActionEvent e){
        Button clickedBtn = (Button) e.getSource();
        String digit = clickedBtn.getText();

        if(currentInput.equals("0")){
            currentInput = digit;
        } else {
            currentInput += digit;
        }
        if (currentInput.endsWith(+))
        display.setText(currentInput);
    }

    @Override
    public void start(Stage primaryStage){

        GridPane grid = new GridPane();

        Label label = new Label("CalculatorFX");
        display = new TextField("");
        display.setText(currentInput);
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);

        Button btn1 = new Button("1");
        btn1.setOnAction(this::handleClick);

        Button btn2 = new Button("2");
        btn2.setOnAction(e -> { handleClick(e); });

        Button btn3 = new Button("3");
        btn3.setOnAction(e -> { handleClick(e); });

        Button btn4 = new Button("4");
        btn4.setOnAction(e -> { handleClick(e); });

        Button btn5 = new Button("5");
        btn5.setOnAction(e -> { handleClick(e); });

        Button btn6 = new Button("6");
        btn6.setOnAction(e -> { handleClick(e); });

        Button btn7 = new Button("7");
        btn7.setOnAction(e -> { handleClick(e); });

        Button btn8 = new Button("8");
        btn8.setOnAction(e -> { handleClick(e); });

        Button btn9 = new Button("9");
        btn9.setOnAction(e -> { handleClick(e); });

        Button btn0 = new Button("0");
        btn0.setOnAction(e -> { handleClick(e); });

        Button btnDot = new Button(".");
        Button btnAdd = new Button("+");
        Button btnSub = new Button("-");
        Button btnDiv = new Button("/");
        Button btnMul = new Button("*");
        Button btnEql = new Button("=");
        Button btnClr = new Button("Clear");

        GridPane.setColumnSpan(display, 4);
        grid.add(display,0,0);

        grid.add(btn1, 0, 1);
        grid.add(btn2, 1, 1);
        grid.add(btn3, 2, 1);

        grid.add(btn4, 0, 2);
        grid.add(btn5, 1, 2);
        grid.add(btn6, 2, 2);

        grid.add(btn7, 0, 3);
        grid.add(btn8, 1, 3);
        grid.add(btn9, 2, 3);

        grid.add(btn0, 0, 4);
        grid.add(btnDot, 1, 4);
        grid.add(btnEql, 2, 4);

        grid.add(btnAdd, 3, 1);
        grid.add(btnSub, 3, 2);
        grid.add(btnMul, 3, 3);
        grid.add(btnDiv, 3, 4);

        GridPane.setColumnSpan(btnClr, 4);
        grid.add(btnClr, 0,5);

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10,10,10,10));

        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(grid);

        Scene scene = new Scene(root, 200, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CalculatorFX");
        primaryStage.show();
    }
}