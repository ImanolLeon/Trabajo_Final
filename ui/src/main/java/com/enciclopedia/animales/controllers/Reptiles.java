package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class Reptiles {
    @FXML
    private RadioButton RB_serpiente, RB_tortuga,RB_camaleon;
    @FXML
    private Button button_atras,button_adelante;
    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }

}
