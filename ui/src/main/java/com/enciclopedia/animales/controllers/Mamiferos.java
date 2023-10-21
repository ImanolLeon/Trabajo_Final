package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class Mamiferos {
    @FXML
    private RadioButton Animal;
    @FXML
    private RadioButton leon;
    @FXML
    private RadioButton jirafa;
    @FXML
    private RadioButton cebra;
    @FXML
    private Button siguiente;
    @FXML
    private Button atras_button;


    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }


}
