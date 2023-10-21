package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class Insectos {
    @FXML
    private RadioButton RB_hormiga, RB_avispa, RB_mosca;
    @FXML
    private Button Button_adelante, Button_atras;
    @FXML
    private ToggleGroup GrupoInsectos;

    @FXML
    private void Retroceder() {
        try {
            App.setRoot(getClass().getResource("Login/PaginaPrinciapl.fxml"));
            App.getMainStage().setTitle("Pagina Principal");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
