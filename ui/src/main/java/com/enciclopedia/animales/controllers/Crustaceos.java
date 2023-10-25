package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class Crustaceos {
    @FXML
    private RadioButton RB_camaron,RB_cangrejo,RB_langosta;
    @FXML
    private Button button_atras,button_adelante;
    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }


}
