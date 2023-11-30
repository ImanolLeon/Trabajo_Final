package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.models.Animal;
import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class VerAnimalController implements Initializable {
    @FXML
    private Label categoriaTxt, animalTxt, habitatTxt, alimentacionTxt, familiaTxt, generoTxt, patasTxt, ojosTxt,
            respiracionTxt, reproduccionTxt;
    @FXML
    private ImageView imageView;
    @FXML
    private Button regresarButton, modificarFavorito;

    private static Animal animal;
    private static HashMap<String, String> ventanas = new HashMap<>();
    static {
        ventanas.put("Principal", "Login/PaginaPrinciapl.fxml");
        ventanas.put("Favoritos", "Favoritos/favoritos.fxml");
    }
    private static String ventana;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        categoriaTxt.setText(animal.getClass().getSimpleName());

        App.getMainStage().setTitle(animal.getClass().getSimpleName());

        if (ventana.equals(ventanas.get("Favoritos"))) {
            regresarButton.setText("Regresar a favoritos");
        } else if (ventana.equals(ventanas.get("Principal"))) {
            regresarButton.setText("Regresar a inicio");
        }

        animalTxt.setText(animal.getNombreAnimal());
        habitatTxt.setText(animal.getHabitad());
        alimentacionTxt.setText(animal.getAlimentacion());
        familiaTxt.setText(animal.getFamilia());
        generoTxt.setText(animal.getGenero());
        patasTxt.setText(animal.getNumeroPatas());
        ojosTxt.setText(animal.getNumeroOjos());
        respiracionTxt.setText(animal.getRespiacion());
        reproduccionTxt.setText(animal.getReproduccion());

        Image image = new Image(System.getProperty("user.dir") + animal.getRutaImagen());
        imageView.setImage(image);

        if (Conexion.getInstancia().getFavoritos().contains(animal)) {
            modificarFavorito.setText("Quitar de favoritos");
        } else {
            modificarFavorito.setText("Agregar a favoritos");
        }
    }

    @FXML
    private void regresar() {
        try {
            App.setRoot(getClass().getResource(ventana));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void setAnimal(Animal animal) {
        VerAnimalController.animal = animal;
    }

    public static void lugarARegresar(String ventanaSeleccionada) {
        VerAnimalController.ventana = ventanas.get(ventanaSeleccionada);
    }

    @FXML
    private void modificarFavorito() {
        if (Conexion.getInstancia().getFavoritos().contains(animal)) {
            Conexion.getInstancia().eliminarFavorito(animal);
            modificarFavorito.setText("Agregar a favoritos");
        } else {
            Conexion.getInstancia().anadirFavorito(animal);
            modificarFavorito.setText("Quitar de favoritos");
        }
    }
}
