package com.example.View;


import com.example.MainApp;
import com.example.Model.MainButton;
import com.example.Model.TopButton;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Calculator extends MainApp {
    public static Label label;
    Stage stage;
    static String textField = "TEST";


    public Calculator(Stage stage) {
        this.stage = stage; 

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400,600);

        Scene scene = new Scene(gridPane);

        label = new Label(textField);
        label.setMinHeight(200);
        gridPane.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        gridPane.add(label,0,0, 3,1);

        gridPane.add(new TopButton("HST"),0,1);
        gridPane.add(new TopButton("CLEAR"),1,1);
        gridPane.add(new TopButton("DELETE"),2,1);
        gridPane.add(new TopButton("/"),3,1);

        gridPane.add(new MainButton("1"),0,2);
        gridPane.add(new MainButton("2"),1,2);
        gridPane.add(new MainButton("3"),2,2);
        gridPane.add(new MainButton("*"),3,2);

        gridPane.add(new MainButton("4"),0,3);
        gridPane.add(new MainButton("5"),1,3);
        gridPane.add(new MainButton("6"),2,3);
        gridPane.add(new MainButton("-"),3,3);

        gridPane.add(new MainButton("7"),0,4);
        gridPane.add(new MainButton("8"),1,4);
        gridPane.add(new MainButton("9"),2,4);
        gridPane.add(new MainButton("+"),3,4);

        gridPane.add(new MainButton(""),0,5);
        gridPane.add(new MainButton("0"),1,5);
        gridPane.add(new MainButton("ANS"),2,5);
        gridPane.add(new MainButton("="),3,5);


        
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }
}
