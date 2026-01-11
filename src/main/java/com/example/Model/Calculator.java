package com.example.Model;

public class Calculator {

    private double currentValue = 0;
    private double storedValue = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public String input(String value) {

        // Number pressed
        if (value.matches("\\d")) {
            if (startNewNumber) {
                currentValue = Double.parseDouble(value);
                startNewNumber = false;
            } else {
                currentValue = Double.parseDouble("" + (int) currentValue + value);
            }
            return String.valueOf((int) currentValue);
        }

        // Operator pressed
        if ("+-*/".contains(value)) {
            storedValue = currentValue;
            operator = value;
            startNewNumber = true;
            return String.valueOf((int) storedValue);
        }

        // Equals
        if (value.equals("=")) {
            switch (operator) {
                case "+" : 
                    currentValue = storedValue + currentValue;
                    break;
                case "-" : 
                    currentValue = storedValue - currentValue;
                    break;
                case "*" : 
                    currentValue = storedValue * currentValue;
                    break;
                case "/" : 
                    currentValue = storedValue / currentValue;
                    break;
            }
            startNewNumber = true;
            return String.valueOf(currentValue);
        }

        // Clear
        if (value.equals("C")) {
            currentValue = 0;
            storedValue = 0;
            operator = "";
            startNewNumber = true;
            return "0";
        }

        return "";
    }
}