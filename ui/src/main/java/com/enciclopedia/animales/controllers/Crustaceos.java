package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.models.Crustaceo;
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

    @FXML
    private void adelante() {
        Crustaceo crustaceo = null;

        if (RB_camaron.isSelected()) {
            crustaceo = Conexion.getInstancia().getCrustaceos().stream().filter(r -> r.getNombreAnimal().equals("Camaron"))
                    .findFirst().orElse(null);
        } else if (RB_cangrejo.isSelected()) {
            crustaceo = Conexion.getInstancia().getCrustaceos().stream().filter(r -> r.getNombreAnimal().equals("Cangrejo"))
                    .findFirst().orElse(null);
        } else if (RB_langosta.isSelected()) {
            crustaceo = Conexion.getInstancia().getCrustaceos().stream().filter(r -> r.getNombreAnimal().equals("Langosta"))
                    .findFirst().orElse(null);
        }

        try {
            VerAnimalController.lugarARegresar("Principal");
            VerAnimalController.setAnimal(crustaceo);
            App.setRoot(getClass().getResource("Animal/Animal_a_mostrar.fxml"));
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error " + e.getMessage());
        }
    }
}
