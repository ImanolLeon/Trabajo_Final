package com.TrabajoFinal.enciclopediaanimales.controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;

import java.io.IOException;

public class ClasePincipal extends Application {

    private static Stage mainStage;
    private static Scene scene;

    public void start(Stage primaryStage) throws IOException {
        mainStage = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader (ClasePincipal.class.getResource("/com/TrabajoFinal/enciclopediaanimales/Login/Login.fxml"));
         scene = new Scene(fxmlLoader.load(), 600, 400);
        mainStage.setTitle("Enciclopedia Animal");
        mainStage.setScene(scene);
        mainStage.show();

    }


    public static void setRoot(URL ruta) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ruta);
        scene.setRoot(fxmlLoader.load());
    }

    public static Stage getMainStage() {
        return mainStage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}