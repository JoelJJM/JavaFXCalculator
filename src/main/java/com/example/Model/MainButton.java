package com.example.Model;

import com.example.Controller.ButtonController;

import javafx.scene.control.Button;

public class MainButton extends Button implements ValueButton {
    private String value;

    public MainButton(String value) {
        super(value);
        this.value = value;
        
        this.setOnAction(event -> ButtonController.buttonHandler(event));
        this.setMinSize(100,100);
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
