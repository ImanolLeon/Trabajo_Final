package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Anelidos {

    @FXML
    private RadioButton RB_gusarapas,RB_lombrices,RB_glycera,RB_sanguijuelas;
    @FXML
    private ToggleGroup GrupoAnelidos;
    @FXML
    private ToggleGroup GrupoInsectos;

    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }
}
