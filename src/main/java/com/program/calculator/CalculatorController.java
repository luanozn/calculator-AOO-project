package com.program.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    private String number = "";
    private Double operation = 0.0;
    private boolean resultButtonUsed = false;
    private char previouslyDoneOperation = '=';

    @FXML
    private TextField operationField;

    @FXML
    private Button clearButton;

    @FXML
    private Button divisionButton;

    @FXML
    private Button multiplicationButton;

    @FXML
    private Button subtractionButton;

    @FXML
    private Button additionButton;

    @FXML
    private Button resultButton;

    @FXML
    private Button zeroButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button nineButton;

    @FXML
    private void onResultButtonClick() {
        try {
            switch (previouslyDoneOperation) {
                case '+':
                    operation += Integer.parseInt(operationField.getText());
                    break;
                case '-':
                    operation -= Integer.parseInt(operationField.getText());
                    break;
                case '*':
                    operation *= Integer.parseInt(operationField.getText());
                    break;
                case '/':
                    operation /= Integer.parseInt(operationField.getText());
                    break;
                case '=':
                    operation = Double.parseDouble(operationField.getText());
            }
        } catch (NumberFormatException ignored) {
        }

        operationField.setText(String.valueOf(operation));
        number = "";
        resultButtonUsed = true;
        previouslyDoneOperation = '=';
    }

    @FXML
    private void onClearButtonClick() {
        number = "";
        operation = 0.0;
        operationField.setText(number);
    }

    @FXML
    private void onAdditionButtonClick() {
        if (!resultButtonUsed) {
            if (!operationField.getText().equals("")) {
                if (previouslyDoneOperation != '=')
                    doPreviouslyDoneOperation();
                else operation += Integer.parseInt(operationField.getText());
            }
        }
        System.out.println(operation);
        number = "";
        operationField.setText("");
        previouslyDoneOperation = '+';
        resultButtonUsed = false;
    }

    @FXML
    private void onSubtractionButtonClick() {
        if (!resultButtonUsed) {
            if (!operationField.getText().equals("")) {
                if (previouslyDoneOperation != '=' )
                    doPreviouslyDoneOperation();
                else
                    operation -= Integer.parseInt(operationField.getText());

                System.out.println(operation);
                number = "";
                operationField.setText("");
                previouslyDoneOperation = '-';
                resultButtonUsed = false;

            }else if(!operationField.getText().equals("-")){
                number += "-";
                operationField.setText(number);
            }
        }
    }

    @FXML
    private void onDivisionButtonClick() {
        if (!resultButtonUsed) {
            if (!operationField.getText().equals("")) {
                if (previouslyDoneOperation != '=')
                    doPreviouslyDoneOperation();
                else operation /= Integer.parseInt(operationField.getText());
            }
        }
        System.out.println(operation);
        number = "";
        operationField.setText("");
        previouslyDoneOperation = '/';
        resultButtonUsed = false;
    }

    @FXML
    private void onMultiplicationButtonClick() {
        if (!resultButtonUsed) {
            if (!operationField.getText().equals("")) {
                if (previouslyDoneOperation != '=')
                    doPreviouslyDoneOperation();
                else
                    operation *= Integer.parseInt(operationField.getText());
            }
        }
        System.out.println(operation);
        number = "";
        operationField.setText("");
        previouslyDoneOperation = '*';
        resultButtonUsed = false;
    }

    @FXML
    private void onZeroButtonClick() {
        if (number.length() != 0)
            operationField.setText(number += "0");
    }

    @FXML
    private void onOneButtonClick() {
        operationField.setText(number += "1");
    }

    @FXML
    private void onTwoButtonClick() {
        operationField.setText(number += "2");
    }

    @FXML
    private void onThreeButtonClick() {
        operationField.setText(number += "3");
    }

    @FXML
    private void onFourButtonClick() {
        operationField.setText(number += "4");
    }

    @FXML
    private void onFiveButtonClick() {
        operationField.setText(number += "5");
    }

    @FXML
    private void onSixButtonClick() {
        operationField.setText(number += "6");
    }

    @FXML
    private void onSevenButtonClick() {
        operationField.setText(number += "7");
    }

    @FXML
    private void onEightButtonClick() {
        operationField.setText(number += "8");
    }

    @FXML
    private void onNineButtonClick() {
        operationField.setText(number += "9");
    }

    private void doPreviouslyDoneOperation() {
        switch (previouslyDoneOperation) {
            case '+':
                operation += Integer.parseInt(operationField.getText());
                break;
            case '-':
                operation -= Integer.parseInt(operationField.getText());
                break;
            case '*':
                operation *= Integer.parseInt(operationField.getText());
                break;
            case '/':
                operation /= Integer.parseInt(operationField.getText());
                break;
            case '=':
                operation = Double.parseDouble(operationField.getText());
        }

    }
}