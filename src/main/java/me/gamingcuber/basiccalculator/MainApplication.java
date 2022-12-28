package me.gamingcuber.basiccalculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApplication extends Application {

    enum Operation {

        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE

    }

    //fields
    Stage MainStage;
    Scene NumberInputScene;
    Operation OP;
    TextField FirstNumberField;
    TextField SecondNumberField;


    @Override
    public void start(Stage PrimaryStage) {

        MainStage = PrimaryStage;

        Button AddButton = new Button("+");
        Button SubtractButton = new Button("-");
        Button MultiplyButton = new Button("*");
        Button DivideButton = new Button("/");

        AddButton.setOnAction(e -> onAddButtonClick());
        SubtractButton.setOnAction(e -> onSubtractButtonClick());
        MultiplyButton.setOnAction(e -> onMultiplyButtonClick());
        DivideButton.setOnAction(e -> onDivideButtonClick());

        VBox Pane = new VBox(10);
        Pane.getChildren().addAll(AddButton, SubtractButton, MultiplyButton, DivideButton);
        Pane.setAlignment(Pos.CENTER);

        Scene OperationSelectScene = new Scene(Pane, 300, 300);

        PrimaryStage.setScene(OperationSelectScene);
        PrimaryStage.setTitle("Select Operation");
        PrimaryStage.show();

    }

    public void onAddButtonClick() {

        OP = Operation.ADD;
        NumberInputScene = getInsertNumberScene();

        MainStage.setScene(NumberInputScene);
        MainStage.setTitle("Input Your Numbers");
        MainStage.show();

    }

    public void onSubtractButtonClick() {

        OP = Operation.SUBTRACT;
        NumberInputScene = getInsertNumberScene();

        MainStage.setScene(NumberInputScene);
        MainStage.setTitle("Input Your Numbers");
        MainStage.show();

    }

    public void onMultiplyButtonClick() {

        OP = Operation.MULTIPLY;
        NumberInputScene = getInsertNumberScene();

        MainStage.setScene(NumberInputScene);
        MainStage.setTitle("Input Your Numbers");
        MainStage.show();

    }

    public void onDivideButtonClick() {

        OP = Operation.DIVIDE;
        NumberInputScene = getInsertNumberScene();

        MainStage.setScene(NumberInputScene);
        MainStage.setTitle("Input Your Numbers");
        MainStage.show();

    }

    public void onEnterButtonClick() {

        int FirstNumber = Integer.parseInt(FirstNumberField.getText());
        int SecondNumber = Integer.parseInt(SecondNumberField.getText());
        int Answer;
        Label AnswerLabel = new Label();
        AnswerLabel.setAlignment(Pos.CENTER);

        if (OP == Operation.ADD) {

            Answer = FirstNumber + SecondNumber;
            AnswerLabel.setText(String.valueOf(Answer));

            Scene AnswerScene = new Scene(AnswerLabel, 100, 100);
            MainStage.setScene(AnswerScene);
            MainStage.setTitle("Here's Your Answer!");
            MainStage.show();

        }

        if (OP == Operation.SUBTRACT) {

            Answer = FirstNumber - SecondNumber;
            AnswerLabel.setText(String.valueOf(Answer));

            Scene AnswerScene = new Scene(AnswerLabel, 100, 100);
            MainStage.setScene(AnswerScene);
            MainStage.setTitle("Here's Your Answer!");
            MainStage.show();
        }

        if (OP == Operation.MULTIPLY) {

            Answer = FirstNumber * SecondNumber;
            AnswerLabel.setText(String.valueOf(Answer));

            Scene AnswerScene = new Scene(AnswerLabel, 100, 100);
            MainStage.setScene(AnswerScene);
            MainStage.setTitle("Here's Your Answer!");
            MainStage.show();
        }

        if (OP == Operation.DIVIDE) {

            Answer = FirstNumber / SecondNumber;
            AnswerLabel.setText(String.valueOf(Answer));

            Scene AnswerScene = new Scene(AnswerLabel, 100, 100);
            MainStage.setScene(AnswerScene);
            MainStage.setTitle("Here's Your Answer!");
            MainStage.show();
        }

    }

    public Scene getInsertNumberScene() {

        Scene NumberScene;

        FirstNumberField = new TextField();
        FirstNumberField.setPromptText("Enter your First Number Here!");
        SecondNumberField = new TextField();
        SecondNumberField.setPromptText("Enter your Second Number Here!");

        Button EnterButton = new Button("Enter");
        EnterButton.setOnAction(e -> onEnterButtonClick());

        VBox FieldPane = new VBox(15);
        FieldPane.getChildren().addAll(FirstNumberField, SecondNumberField, EnterButton);
        FieldPane.setAlignment(Pos.CENTER);

        NumberScene = new Scene(FieldPane, 350, 350);

        return NumberScene;

    }


    public static void main(String[] args) {
        launch(args);
    }
}