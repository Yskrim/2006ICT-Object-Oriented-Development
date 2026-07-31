package org.example;
import javafx.application.Application; // Entry point for JavaFX apps
import javafx.scene.Scene; // Container for all UI
import javafx.scene.control.Label; // Node -- a UI component
import javafx.scene.layout.StackPane; // layout pane -- organizes UI components
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
        Label label = new Label("Hello from JavaFX + Maven!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Maven Project");
        primaryStage.show();
    }
}
