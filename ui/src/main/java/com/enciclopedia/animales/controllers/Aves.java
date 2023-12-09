package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.models.Ave;
import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class Aves {
    @FXML
    private RadioButton RB_pava, RB_cortarrama, RB_gallito;
    @FXML
    private Button Button_adelante, Button_atras;

    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }

    @FXML
    private void adelante() {
        Ave ave = null;

        if (RB_pava.isSelected()) {
            ave = Conexion.getInstancia().getAves().stream().filter(a -> a.getNombreAnimal().equals("Pava aliblanca"))
                    .findFirst().orElse(null);
        } else if (RB_cortarrama.isSelected()) {
            ave = Conexion.getInstancia().getAves().stream()
                    .filter(a -> a.getNombreAnimal().equals("Cortarrame peruano"))
                    .findFirst().orElse(null);
        } else if (RB_gallito.isSelected()) {
            ave = Conexion.getInstancia().getAves().stream()
                    .filter(a -> a.getNombreAnimal().equals("Gallito de las rocas"))
                    .findFirst().orElse(null);
        }

        try {
            VerAnimalController.lugarARegresar("Principal");
            VerAnimalController.setAnimal(ave);
            App.setRoot(getClass().getResource("Animal/Animal_a_mostrar.fxml"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
