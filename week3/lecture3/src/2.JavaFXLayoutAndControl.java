/**********************************  // 1.VBox  *************************************/

public class CodeDemonstration extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(15); // gap between
        vbox.setPadding(new Insets(25)); // padding
        Label label = new Label("Choose your character");
        Button button = new Button("Start Game");

        vbox.getChildren().addAll(label, button);
    }
}

/**********************************  // 2.GridPane  *************************************/

public class CodeDemonstration extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setHgap(8);
        grid.setVgap(12);

        grid.add(new Label("Email:"), 0, 0);
        grid.add(new TextField(), 1, 0);
        grid.add(new Label("Age:"), 0, 1);
        grid.add(new TextField(), 1, 1);
        grid.add(new Button("Register"), 1, 2);
    }
}

/*********************************  // 3.BorderPane  **************************************/

public class CodeDemonstration extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Label("Inventory System"));

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(new Button("Weapons"), new Button("Armor"));
        borderPane.setLeft(vbox);

        borderPane.setCenter(new Label("Select a category"));
        // если не задать right/bottom, скорее всего область останется пустой. null by default, no error.
    }
}

/**********************************  // 4.CheckBox, RadioButton, ToggleGroup *************************************/

public class CodeDemonstration extends Application {
    @Override
    public void start(Stage primaryStage) {
        CheckBox hard = new CheckBox("Hardcore mode");
        hard.setOnAction(e -> System.out.println("Hardcore Mode: " + hard.isSelected()));

        RadioButton rbtn1 = new RadioButton("Easy");
        RadioButton rbtn2 = new RadioButton("Hard");

        ToggleGroup difficultyGroup = new ToggleGroup(); // gather radio buttons into a group
        rbtn1.setToggleGroup(difficultyGroup);
        rbtn2.setToggleGroup(difficultyGroup);
    }
}

/**********************************  // 5.ComboBox & Slider + listener  *************************************/

public class CodeDemonstration extends Application {
    @Override
    public void start(Stage primaryStage) {
        ComboBox<String> comboBox = new ComboBox<>(); // drop select, <typeOfValues>,  <> = diamond operator(type on left == type on right)
        comboBox.getItems().addAll("Sword", "Bow", "Staff");
        comboBox.setOnAction(e -> System.out.println("Weapon chosen: " + comboBox.getValue()));
****************
        Slider slider = new Slider(0, 10, 5); // (min, max, init) values order
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(2);
        slider.valueProperty().addListener((obs, oldVal, newVal) -> System.out.println("Difficulty: " + newVal.intValue()));
        // slider has 3 parameters(observable, old value, new value)
    }
}
/***********************************************************************************************************************/