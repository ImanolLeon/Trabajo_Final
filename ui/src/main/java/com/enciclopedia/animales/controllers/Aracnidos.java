package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.models.Aracnido;
import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Aracnidos {
    @FXML
    private Label text_titulo;
    @FXML
    private Label text_pregunta;
    @FXML
    private RadioButton RB_tarantula;
    @FXML
    private RadioButton RB_viudanegra;
    @FXML
    private RadioButton RB_aranaLobo;
    @FXML
    private Button boton_Atras,boton_adelante;
    @FXML
    private Image Imagen1;
    @FXML
    private Image imagen2;

    @FXML
    private void Retroceder() {
        App.irAPrincipal();
    }

    @FXML
    private void adelante() {
        Aracnido aracnido = null;

        if (RB_tarantula.isSelected()) {
            aracnido = Conexion.getInstancia().getAracnidos().stream().filter(a -> a.getNombreAnimal().equals("Tarántula"))
                    .findFirst().orElse(null);
        } else if (RB_viudanegra.isSelected()) {
            aracnido = Conexion.getInstancia().getAracnidos().stream().filter(a -> a.getNombreAnimal().equals("Viuda Negra"))
                    .findFirst().orElse(null);
        } else if (RB_aranaLobo.isSelected()) {
            aracnido = Conexion.getInstancia().getAracnidos().stream().filter(a -> a.getNombreAnimal().equals("Araña Lobo"))
                    .findFirst().orElse(null);
        }

        try {
            VerAnimalController.lugarARegresar("Principal");
            VerAnimalController.setAnimal(aracnido);
            App.setRoot(getClass().getResource("Animal/Animal_a_mostrar.fxml"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
