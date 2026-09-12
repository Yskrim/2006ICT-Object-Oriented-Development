package lecture3;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;


public class Main extends Application {
    public static void main(String[] args) { launch(args); }
    @Override
    public void start(Stage primaryStage) throws Exception {

        // 1. Pane - free position container
        Pane pane = new Pane();
        Rectangle rect1 = new Rectangle(60, 120,40,40);
        // pane.getChildren().add(rect1);

        // 2. Shape + fill & stroke
        Rectangle rect2 = new Rectangle(0,0,100,100);
        rect2.setFill(Color.BLUE);
        Circle cir2 = new Circle(20, Color.GREEN);
        cir2.setStroke(Color.BLACK);
        cir2.setStrokeWidth(3);
        cir2.setCenterX(150);
        cir2.setCenterY(100);
        // pane.getChildren().addAll(rect2, cir2);


        // 3. Animation timer
        // == abstract class,
        // single method handle(long now),
        // jFX calls 60 times/s == 60fps.
        double width = 300.0;
        double height = 200.0;
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) { }
        };
        timer.start();

        // 4. Keystroke handling
        Scene scene4 = new Scene(pane, width, height);
        scene4.setOnKeyPressed(e -> {
            switch(e.getCode()){
                case LEFT -> System.out.println("Move left");
                case RIGHT -> System.out.println("Move right");
                case SPACE -> System.out.println("Jump");
            }
        });
//        primaryStage.setScene(scene4);
//        primaryStage.show();
//        pane.requestFocus();


        // 5. Screen Navigation
        // switch between screens in JavaFX using StackPane
        StackPane root = new StackPane();
        VBox menuScreen = new VBox();
        Button playBtn = new Button("Play");
        menuScreen.getChildren().add(playBtn);

        VBox gameScreen = new VBox();
        Button pauseBtn = new Button("Pause");
        gameScreen.getChildren().add(pauseBtn);

        VBox pauseScreen = new VBox();
        Button resumeBtn = new Button("Resume");
        pauseScreen.getChildren().add(resumeBtn);

        playBtn.setOnAction(e -> root.getChildren().setAll(gameScreen));
        pauseBtn.setOnAction(e -> root.getChildren().setAll(pauseScreen));
        resumeBtn.setOnAction(e -> root.getChildren().setAll(gameScreen));

        root.getChildren().add(menuScreen);

        Scene scene5 = new Scene(root, width, height);
        primaryStage.setScene(scene5);
        primaryStage.show();
    }
}
