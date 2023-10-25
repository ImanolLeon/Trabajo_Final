package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Peces {

    @FXML
    private RadioButton RB_atun, RB_aespada, RB_raya;

    @FXML
    private Button Button_adelante,Button_atras;

    @FXML
    private ToggleGroup  GrupoPecess;


    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }


    }



