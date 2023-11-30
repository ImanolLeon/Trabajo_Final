package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PaginaPrincipal {

    @FXML
    private Label text1,text;
    @FXML
    private RadioButton RB_mamifero,RB_peces,RB_aves,RB_anfibios,RB_insectos,RB_aracnido,RB_anelidos,RB_crustaceos,RB_reptiles;
    @FXML
    private ToggleGroup GrupoAnimales;
    @FXML
    private Image imagen1;
    @FXML
    private Button butto_Adelante;
    @FXML
    private AnchorPane panel1,panel2;

    @FXML
    private void CambiarScene(){
        if (RB_anfibios.isSelected()) {
            try {
                App.setRoot(getClass().getResource("Anfibios/Anfibios.fxml"));
                App.getMainStage().setTitle("Anfibios");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (RB_mamifero.isSelected()){
            try {
                App.setRoot(getClass().getResource("Mamiferos/Mamiferos.fxml"));
                App.getMainStage().setTitle("Mamiferos");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (RB_aves.isSelected()){
            try {
                App.setRoot(getClass().getResource("Aves/Aves.fxml"));
                App.getMainStage().setTitle("Aves");
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (RB_aracnido.isSelected()) {
            try {
                App.setRoot(getClass().getResource("Aracnidos/Aracnidos.fxml"));
                App.getMainStage().setTitle("Aracnidos");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (RB_insectos.isSelected()) {
            try {
                App.setRoot(getClass().getResource("Insectos/Insectos.fxml"));
                App.getMainStage().setTitle("Insectos");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (RB_crustaceos.isSelected()) {
            try {
                App.setRoot(getClass().getResource("Crustaceos/Crustaceos.fxml"));
                App.getMainStage().setTitle("Crustaceos");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (RB_reptiles.isSelected()) {
            try {
                App.setRoot(getClass().getResource("Reptiles/Reptiles.fxml"));
                App.getMainStage().setTitle("Reptiles");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (RB_anelidos.isSelected()) {
            try {
                App.setRoot(getClass().getResource("Anelidos/Anelidos.fxml"));
                App.getMainStage().setTitle("Anelidos");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (RB_peces.isSelected()) {
            try {
                App.setRoot(getClass().getResource("Peces/Peces.fxml"));
                App.getMainStage().setTitle("Peces");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @FXML
    private void mostrarFavoritos(){
        try {
            App.setRoot(getClass().getResource("Favoritos/Favoritos.fxml"));
            App.getMainStage().setTitle("Favoritos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}

