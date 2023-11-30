package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.models.Anfibio;
import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Anfibios {
    @FXML
    private Label ttext_titulo;
    @FXML
    private Label text_pregunta;
    @FXML
    private RadioButton RB_ajolote;
    @FXML
    private RadioButton RB_rana;
    @FXML
    private RadioButton RB_salamandra;
    @FXML
    private RadioButton RB_sapo;
    @FXML
    private javafx.scene.control.Button boton_atras;
    @FXML
    private javafx.scene.control.Button boton_Adelante;
    @FXML
    private Image imagen1;
    @FXML
    private Image imagen2;

    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }

    @FXML
    private void adelante() {
        Anfibio anfibio = null;

        if (RB_ajolote.isSelected()) {
            anfibio = Conexion.getInstancia().getAnfibios().stream().filter(a -> a.getNombreAnimal().equals("Ajolote"))
                    .findFirst().orElse(null);
        } else if (RB_rana.isSelected()) {
            anfibio = Conexion.getInstancia().getAnfibios().stream().filter(a -> a.getNombreAnimal().equals("Rana"))
                    .findFirst().orElse(null);
        } else if (RB_salamandra.isSelected()) {
            anfibio = Conexion.getInstancia().getAnfibios().stream().filter(a -> a.getNombreAnimal().equals("Salamandra"))
                    .findFirst().orElse(null);
        } else if (RB_sapo.isSelected()) {
            anfibio = Conexion.getInstancia().getAnfibios().stream().filter(a -> a.getNombreAnimal().equals("Sapo"))
                    .findFirst().orElse(null);
        }

        try {
            VerAnimalController.lugarARegresar("Principal");
            VerAnimalController.setAnimal(anfibio);
            App.setRoot(getClass().getResource("Animal/Animal_a_mostrar.fxml"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
