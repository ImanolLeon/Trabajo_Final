package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.models.Anelido;
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
    @FXML
    private void adelante() {
        Anelido anelido = null;

        if (RB_gusarapas.isSelected()) {
            anelido = Conexion.getInstancia().getAnelidos().stream().filter(r -> r.getNombreAnimal().equals("Poliqueto marino"))
                    .findFirst().orElse(null);
        } else if (RB_lombrices.isSelected()) {
            anelido = Conexion.getInstancia().getAnelidos().stream().filter(r -> r.getNombreAnimal().equals("Lombrices"))
                    .findFirst().orElse(null);
        } else if (RB_glycera.isSelected()) {
            anelido = Conexion.getInstancia().getAnelidos().stream().filter(r -> r.getNombreAnimal().equals("Gusano de seda"))
                    .findFirst().orElse(null);
        } else if (RB_sanguijuelas.isSelected()) {
            anelido = Conexion.getInstancia().getAnelidos().stream().filter(r -> r.getNombreAnimal().equals("Sanguijuelas"))
                    .findFirst().orElse(null);
        }

        try {
            VerAnimalController.lugarARegresar("Principal");
            VerAnimalController.setAnimal(anelido);
            App.setRoot(getClass().getResource("Animal/Animal_a_mostrar.fxml"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
