package org.example;
import javafx.application.Application; // Entry point for JavaFX apps
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene; // Container for all UI
import javafx.scene.control.Label; // Node -- a UI component
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane; // layout pane -- organizes UI components
import javafx.scene.layout.VBox; // layout pane -- organizes UI components
import javafx.stage.Stage; // Main window
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        Label label = new Label("Enter your name:");
        TextField input = new TextField();
        Button btn = new Button("Submit");

        btn.setOnAction(e -> {
            String name = input.getText();
            label.setText("Hello, " + name);
        });

//        StackPane root = new StackPane(label, input, btn);
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(label, input, btn);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Maven Project");
        primaryStage.show();
    }
}
