package com.TrabajoFinal.enciclopediaanimales.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Aracnidos implements Initializable {

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
    public javafx.scene.control.Button boton_Atras,boton_adelante;

    @FXML
    private Image Imagen1;
    @FXML
    private Image imagen2;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
