package com.example;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import com.example.View.Calculator;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        new Calculator(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
