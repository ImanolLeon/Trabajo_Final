package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.models.Insecto;
import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Insectos {
    @FXML
    private RadioButton RB_hormiga, RB_avispa, RB_mosca;
    @FXML
    private Button Button_adelante, Button_atras;
    @FXML
    private ToggleGroup GrupoInsectos;

    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }

    @FXML
    private void adelante() {
        Insecto insecto = null;

        if (RB_hormiga.isSelected()) {
            insecto = Conexion.getInstancia().getInsectos().stream().filter(r -> r.getNombreAnimal().equals("Hormiga"))
                    .findFirst().orElse(null);
        } else if (RB_avispa.isSelected()) {
            insecto = Conexion.getInstancia().getInsectos().stream().filter(r -> r.getNombreAnimal().equals("Avispa"))
                    .findFirst().orElse(null);
        } else if (RB_mosca.isSelected()) {
            insecto = Conexion.getInstancia().getInsectos().stream().filter(r -> r.getNombreAnimal().equals("Mosca"))
                    .findFirst().orElse(null);
        }

        try {
            VerAnimalController.lugarARegresar("Principal");
            VerAnimalController.setAnimal(insecto);
            App.setRoot(getClass().getResource("Animal/Animal_a_mostrar.fxml"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
