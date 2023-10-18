package com.TrabajoFinal.enciclopediaanimales.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class UtilsScene {
    public static void changeScene(ActionEvent event, String fxmFile, String tittle) {
        URL fxmlUrl = UtilsScene.class.getResource("/com/TrabajoFinal/enciclopediaanimales/" + fxmFile);
        FXMLLoader loader = new FXMLLoader(fxmlUrl);
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            System.out.println("entró al catch");
            
        }

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println(stage);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle(tittle);
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }
}
