package com.program.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

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
            doPreviouslyDoneOperation();
        } catch (NumberFormatException ignored) {
        }

        operationField.setText(String.valueOf(operation));
        resultButtonUsed = true;
        previouslyDoneOperation = '=';
    }

    @FXML
    private void onClearButtonClick() {
        operation = 0.0;
        operationField.setText("");
        previouslyDoneOperation = '=';
        resultButtonUsed = false;

    }

    @FXML
    private void onAdditionButtonClick() {

        if (!resultButtonUsed) {
            if (!operationField.getText().equals("")) {
                if (previouslyDoneOperation != '=')
                    doPreviouslyDoneOperation();
                else operation += Integer.parseInt(operationField.getText());
            }
        }else
            operationField.setText("");

        System.out.println(operation);
        operationField.setText("");
        previouslyDoneOperation = '+';
        resultButtonUsed = false;
    }

    @FXML
    private void onSubtractionButtonClick() {
        if (!resultButtonUsed) {
            if (!operationField.getText().equals("")) {
                if (previouslyDoneOperation != '=')
                    doPreviouslyDoneOperation();
                else
                    if(Integer.parseInt(operationField.getText()) < 0 || operation == 0)
                        operation += Integer.parseInt(operationField.getText());
                    else
                        operation -= Integer.parseInt(operationField.getText());

                System.out.println(operation);

            }
        }else
            operationField.setText("");

        operationField.setText("");
        previouslyDoneOperation = '-';
        resultButtonUsed = false;
    }

    @FXML
    private void onDivisionButtonClick() {
        if (!resultButtonUsed) {
            if (!operationField.getText().equals("")) {
                if (previouslyDoneOperation != '=')
                    doPreviouslyDoneOperation();
                else operation /= Integer.parseInt(operationField.getText());
            }
        }else
            operationField.setText("");
        System.out.println(operation);
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
        }else
            operationField.setText("");
        
        System.out.println(operation);
        operationField.setText("");
        previouslyDoneOperation = '*';
        resultButtonUsed = false;
    }

    @FXML
    private void onZeroButtonClick() {
        if (operationField.getText().length() != 0)
            operationField.setText(operationField.getText() + "0");
    }

    @FXML
    private void onOneButtonClick() {
        operationField.setText(operationField.getText() + "1");
    }

    @FXML
    private void onTwoButtonClick() {
        operationField.setText(operationField.getText() + "2");
    }

    @FXML
    private void onThreeButtonClick() {
        operationField.setText(operationField.getText() + "3");
    }

    @FXML
    private void onFourButtonClick() {
        operationField.setText(operationField.getText() + "4");
    }

    @FXML
    private void onFiveButtonClick() {
        operationField.setText(operationField.getText() + "5");
    }

    @FXML
    private void onSixButtonClick() {
        operationField.setText(operationField.getText() + "6");
    }

    @FXML
    private void onSevenButtonClick() {
        operationField.setText(operationField.getText() + "7");
    }

    @FXML
    private void onEightButtonClick() {
        operationField.setText(operationField.getText() + "8");
    }

    @FXML
    private void onNineButtonClick() {
        operationField.setText(operationField.getText() + "9");
    }

    private void doPreviouslyDoneOperation() {
        switch (previouslyDoneOperation) {
            case '+':
                operation += Integer.parseInt(operationField.getText());
                break;
            case '-':
                if(Integer.parseInt(operationField.getText()) < 0)
                    operation += Integer.parseInt(operationField.getText());
                else
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