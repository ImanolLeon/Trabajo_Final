package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Aracnidos {
    @FXML
    private Label text_titulo;
    @FXML
    private Label text_pregunta;
    @FXML
    private RadioButton RB_tarantula;
    @FXML
    private RadioButton RB_viudanegra;
    @FXML
    private RadioButton RB_aranaLobo;
    @FXML
    private Button boton_Atras,boton_adelante;
    @FXML
    private Image Imagen1;
    @FXML
    private Image imagen2;

    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }
}
