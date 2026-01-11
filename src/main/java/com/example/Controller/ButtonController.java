package com.example.Controller;

import com.example.Model.Calculator;
import com.example.Model.ValueButton;
import javafx.event.ActionEvent;

public class ButtonController {

    private static final Calculator calculator = new Calculator();

    public static void buttonHandler(ActionEvent event) {
        ValueButton button = (ValueButton) event.getSource();
        String value = button.getValue();

        String result = calculator.input(value);

        com.example.View.Calculator.label.setText(result);
    }
}