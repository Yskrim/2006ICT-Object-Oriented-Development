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

public class BouncyBall extends Application {
    public static void main(String[] args) { launch(args); }
        public class Ball {
        int r;
        double vx=0;
        double vy=0;
        Color color;
        Circle ball;

        public Ball(){
            this.r = 10;
            this.vx=0.0;
            this.vy=0.0;
            this.color = Color.RED;

            this.ball = new Circle(this.r, this.color);
            this.ball.setCenterX(50);
            this.ball.setCenterY(50);
        }

        public Ball(int r, double vx, double vy, Color color){
            this.r = r;
            this.vx = vx;
            this.vy = vy;
            this.color = color;
            this.ball = new Circle(this.r, this.color);
            this.ball.setCenterX(50);
            this.ball.setCenterY(50);
        }

        public void bounceX(){ this.vx *= -1; }
        public void bounceY(){ this.vy *= -1; }

        public void moveY(){ this.ball.setCenterY(this.ball.getCenterY() + this.vy); }
        public void moveX(){ this.ball.setCenterX(this.ball.getCenterX() + this.vx); }

        public void frictionX(){ if(Math.abs(this.vx) > 0){ this.vx *= 0.97; } }
        public void frictionY(){ if(Math.abs(this.vy) > 0){ this.vy *= 0.97; } }
    }

    // 3. Animation timer
    // == abstract class,
    // single method handle(long now),
    // jFX calls 60 times/s == 60fps.

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        double width = 300.0;
        double height = 200.0;
        AtomicBoolean isPressed = new AtomicBoolean(false);

        Ball shape = new Ball();
        pane.getChildren().add(shape.ball);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if(shape.ball.getCenterX() > width - shape.r || shape.ball.getCenterX() < shape.r){ shape.bounceX(); }
                if(shape.ball.getCenterY() > height - shape.r || shape.ball.getCenterY() < shape.r){ shape.bounceY(); }

                shape.moveY();
                shape.moveX();
                shape.frictionY();
                shape.frictionX();
            }
        };
        timer.start();

        Scene scene = new Scene(pane, width, height);
        scene.setOnKeyPressed(e -> {
            isPressed.set(true);
            switch(e.getCode()) {
                case UP -> shape.vy-=1.0;
                case DOWN -> shape.vy+=1.0;
                case LEFT -> shape.vx-=1.0;
                case RIGHT -> shape.vx+=1.0;
            }
        });
        scene.setOnKeyReleased(e -> {
            String[] keyCodes = { "UP", "DOWN", "LEFT", "RIGHT" };
            isPressed.set(Arrays.stream(keyCodes).anyMatch(e.getCode()::equals));
        });
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }
}
