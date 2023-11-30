package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.models.Pez;
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

    @FXML
    private void adelante() {
        Pez pez = null;
        if (RB_atun.isSelected()) {
            pez = Conexion.getInstancia().getPeces().stream().filter(r -> r.getNombreAnimal().equals("Atún"))
                    .findFirst().orElse(null);
        } else if (RB_aespada.isSelected()) {
            pez = Conexion.getInstancia().getPeces().stream().filter(r -> r.getNombreAnimal().equals("Pez Espada"))
                    .findFirst().orElse(null);
        } else if (RB_raya.isSelected()) {
            pez = Conexion.getInstancia().getPeces().stream().filter(r -> r.getNombreAnimal().equals("Raya"))
                    .findFirst().orElse(null);
        }

        try{
            VerAnimalController.lugarARegresar("Principal");
            VerAnimalController.setAnimal(pez);
            App.setRoot(getClass().getResource("Animal/Animal_a_mostrar.fxml"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    }



