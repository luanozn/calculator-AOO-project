package com.program.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApp.class.getResource("calculator-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 230, 330);
        stage.setTitle("Calculator");
        stage.getIcons().add(new Image("https://img.icons8.com/color/48/undefined/calculator--v1.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}