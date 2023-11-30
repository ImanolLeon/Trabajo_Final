package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.models.Reptil;
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
    private void adelante() {
        Reptil reptil = null;
        if (RB_serpiente.isSelected()) {
            reptil = Conexion.getInstancia().getReptiles().stream().filter(r -> r.getNombreAnimal().equals("Serpiente"))
                    .findFirst().orElse(null);
        } else if (RB_tortuga.isSelected()) {
            reptil = Conexion.getInstancia().getReptiles().stream().filter(r -> r.getNombreAnimal().equals("Tortuga"))
                    .findFirst().orElse(null);
        } else if (RB_camaleon.isSelected()) {
            reptil = Conexion.getInstancia().getReptiles().stream().filter(r -> r.getNombreAnimal().equals("Camaleón"))
                    .findFirst().orElse(null);
        }

        try {
            VerAnimalController.lugarARegresar("Principal");
            VerAnimalController.setAnimal(reptil);
            App.setRoot(getClass().getResource("Animal/Animal_a_mostrar.fxml"));
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error " + e.getMessage());
        }
    }
    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }

}
