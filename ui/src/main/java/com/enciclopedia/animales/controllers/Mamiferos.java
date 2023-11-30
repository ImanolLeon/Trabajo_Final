package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.models.Mamifero;
import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class Mamiferos {
    @FXML
    private RadioButton Animal;
    @FXML
    private RadioButton leon;
    @FXML
    private RadioButton jirafa;
    @FXML
    private RadioButton cebra;
    @FXML
    private Button siguiente;
    @FXML
    private Button atras_button;


    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }

    @FXML
    private void adelante() {
        Mamifero mamifero = null;
        if (leon.isSelected()) {
            mamifero = Conexion.getInstancia().getMamiferos().stream().filter(m -> m.getNombreAnimal().equals("León"))
                    .findFirst().orElse(null);
        } else if (jirafa.isSelected()) {
            mamifero = Conexion.getInstancia().getMamiferos().stream().filter(m -> m.getNombreAnimal().equals("Jirafa"))
                    .findFirst().orElse(null);
        } else if (cebra.isSelected()) {
            mamifero = Conexion.getInstancia().getMamiferos().stream().filter(m -> m.getNombreAnimal().equals("Cebra"))
                    .findFirst().orElse(null);
        }

        try {
            VerAnimalController.lugarARegresar("Principal");
            VerAnimalController.setAnimal(mamifero);

            App.setRoot(getClass().getResource("Animal/Animal_a_mostrar.fxml"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
