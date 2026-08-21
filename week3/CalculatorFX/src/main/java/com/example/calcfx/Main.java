package com.example.calcfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private TextField display; // create new display on main but pass it's state to controller later
    private CalculatorController controller; // create a new controller (equation, state variables)

    @Override
    public void start(Stage primaryStage){
        GridPane grid = new GridPane(); // create an empty grid

        // set up display
        display = new TextField("0");
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);
        controller = new CalculatorController(display); // pass display to controller object

        // create and set up each button with a click handler
        Button btn1 = new Button("1");
        btn1.setOnAction(controller::handleClick);

        Button btn2 = new Button("2");
        btn2.setOnAction(controller::handleClick);

        Button btn3 = new Button("3");
        btn3.setOnAction(controller::handleClick);

        Button btn4 = new Button("4");
        btn4.setOnAction(controller::handleClick);

        Button btn5 = new Button("5");
        btn5.setOnAction(controller::handleClick);

        Button btn6 = new Button("6");
        btn6.setOnAction(controller::handleClick);

        Button btn7 = new Button("7");
        btn7.setOnAction(controller::handleClick);

        Button btn8 = new Button("8");
        btn8.setOnAction(controller::handleClick);

        Button btn9 = new Button("9");
        btn9.setOnAction(controller::handleClick);

        Button btn0 = new Button("0");
        btn0.setOnAction(controller::handleClick);

        Button btnDot = new Button("."); // TODO

        Button btnAdd = new Button("+");
        btnAdd.setOnAction(controller::handleOperator);

        Button btnSub = new Button("-");
        btnSub.setOnAction(controller::handleOperator);

        Button btnDiv = new Button("/");
        btnDiv.setOnAction(controller::handleOperator);

        Button btnMul = new Button("*");
        btnMul.setOnAction(controller::handleOperator);

        Button btnEql = new Button("=");
        btnEql.setOnAction(controller::handleEquals);

        Button btnClr = new Button("Clear");
        btnClr.setOnAction(controller::handleClear);

        // set up the grid rules and position each button accordingly
        //row 0
        GridPane.setColumnSpan(display, 4);
        grid.add(display,0,0);

        //row 1
        grid.add(btn1, 0, 1);
        grid.add(btn2, 1, 1);
        grid.add(btn3, 2, 1);
        grid.add(btnAdd, 3, 1);

        //row 2
        grid.add(btn4, 0, 2);
        grid.add(btn5, 1, 2);
        grid.add(btn6, 2, 2);
        grid.add(btnSub, 3, 2);

        //row 3
        grid.add(btn7, 0, 3);
        grid.add(btn8, 1, 3);
        grid.add(btn9, 2, 3);
        grid.add(btnMul, 3, 3);

        //row 4
        grid.add(btn0, 0, 4);
        grid.add(btnDot, 1, 4);
        grid.add(btnEql, 2, 4);
        grid.add(btnDiv, 3, 4);

        //row 5 -- supposedly meant to span across the whole row
        GridPane.setColumnSpan(btnClr, 4);
        grid.add(btnClr, 0,5);

        // adjust grid padding between elements
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10,10,10,10));

        // set up a vbox (==flex) container for the button elements
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(grid); // add the full grid to vbox

        // create an app window (stage) + and add the body(scene) that stores vbox (flex container with contents) inside
        Scene scene = new Scene(root, 200, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CalculatorFX");
        primaryStage.show();
    }
}