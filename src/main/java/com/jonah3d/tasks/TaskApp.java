package com.jonah3d.tasks;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TaskApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TaskApp.class.getResource("/FXML/Taskmanagerview.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1443, 1045);
        stage.setTitle("To-Do List!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}