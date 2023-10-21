package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Anfibios {
    @FXML
    private Label ttext_titulo;
    @FXML
    private Label text_pregunta;
    @FXML
    private RadioButton RB_ajolote;
    @FXML
    private RadioButton RB_rana;
    @FXML
    private RadioButton RB_salamandra;
    @FXML
    private RadioButton RB_sapo;
    @FXML
    private javafx.scene.control.Button boton_atras;
    @FXML
    private javafx.scene.control.Button boton_Adelante;
    @FXML
    private Image imagen1;
    @FXML
    private Image imagen2;

    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }
}
