package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new Group(), 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Pane Demo");
        primaryStage.show();

//        Parent root = startVBox();
//        Parent root = startGrid();
//        Parent root = startBorderPane();
        Parent root = startControlExample();
        scene.setRoot(root);
    }

    Parent startControlExample(){
        // CheckBoxes
        CheckBox cb1 = new CheckBox("Enable Notifications");
        CheckBox cb2 = new CheckBox("Enable Dark Mode");
        cb1.setOnAction(e -> System.out.println("Notifications: " + cb1.isSelected()));
        cb2.setOnAction(e -> System.out.println("Dark Mode: " + cb2.isSelected()));

        // RadioButtons
        RadioButton rb1 = new RadioButton("Male");
        RadioButton rb2 = new RadioButton("Female");
        ToggleGroup genderGroup = new ToggleGroup();
        rb1.setToggleGroup(genderGroup);
        rb2.setToggleGroup(genderGroup);
        rb1.setOnAction(e -> System.out.println("Selected Gender: Male"));
        rb2.setOnAction(e -> System.out.println("Selected Gender: Female"));

        // ComboBox
        ComboBox<String> fruitsCombo = new ComboBox<>();
        fruitsCombo.getItems().addAll("Apple", "Banana", "Cherry");
        fruitsCombo.setOnAction(e -> {
            String selected = fruitsCombo.getValue();
            System.out.println("Selected Fruit: " + selected);
        });

        // Slider
        Slider volumeSlider = new Slider(0, 100, 50);
        volumeSlider.setShowTickLabels(true);
        volumeSlider.setShowTickMarks(true);
        volumeSlider.setMajorTickUnit(25);
        volumeSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            System.out.println("Volume: " + newVal.intValue());
        });

        // Layout
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.getChildren().addAll(
                new Label("Select options:"),
                cb1, cb2,
                new Label("Select gender:"),
                rb1, rb2,
                new Label("Select fruit:"),
                fruitsCombo,
                new Label("Adjust volume:"),
                volumeSlider
        );
        return vbox;
    }

    Parent startBorderPane(){
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> System.exit(0));
        fileMenu.getItems().add(exitItem);
        menuBar.getMenus().add(fileMenu);

        VBox nav = new VBox(10);

        nav.setPadding(new Insets(10));
        Button homeButton = new Button("Home");
        Button settingsButton = new Button("Setting");
        nav.getChildren().addAll(homeButton, settingsButton);

        Label mainContent = new Label("Welcome to the app!");
        mainContent.setStyle("-fx-font-size: 16px;");
        Label statusBar = new Label("Status: Ready");

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setLeft(nav);
        borderPane.setCenter(mainContent);
        borderPane.setBottom(statusBar);
        return borderPane;


    }
    Parent startVBox(){
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button button = new Button("Say Hello");
        Label message = new Label();

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.getChildren().addAll(label, textField, button, message);
        button.setOnAction(e -> {
            String name = textField.getText();
            message.setText("Hello, " + name + "!");
        });
        return vbox;
    }
    Parent startGrid(){
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label ("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Label messageLabel = new Label();

        loginButton.setOnAction(e->{
            String username = usernameField.getText();
            String password = passwordField.getText();
            if(username.equals("admin") && password.equals("password")) {
                messageLabel.setText("Login successful!");
            } else {
                messageLabel.setText("Invalid credentials!");
            }
        });

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(usernameLabel,0,0);
        grid.add(usernameField,1,0);
        grid.add(passwordLabel,0,1);
        grid.add(passwordField,1,1);
        grid.add(loginButton,1,2);
        grid.add(messageLabel,1,3);
        return grid;
    }
}
