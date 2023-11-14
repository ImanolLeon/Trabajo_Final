package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class EntradaErronea {
    @FXML
    private Button button_salir;
    @FXML
    private Button button_intentar;

    @FXML
    private void nuevo_intento (){
        try {
            App.setRoot(getClass().getResource("Login/Login.fxml"));
            App.getMainStage().setTitle("Login");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    @FXML
    private void Cerrar_programa(){

        //Cerrar ventana
        Stage stage = (Stage) button_salir.getScene().getWindow();
        stage.close();


    }

}
