package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private int screenWidth = 1920;
    private int screenHeight = 1080;
    @Override
    public void start(Stage stage) throws IOException {
        Pane myPane = new Pane();
        Scene scene = new Scene(myPane, screenWidth , screenHeight);
        stage.setTitle("Algo Oblig!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}