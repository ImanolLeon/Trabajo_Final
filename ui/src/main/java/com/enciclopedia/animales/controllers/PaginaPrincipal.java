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
    private RadioButton Rbmamifero,RBpece,RBaves,RBanfibios,RBinsectos,RBaracnido,RBanelidos,RBcrustaceos,RBreptiles;
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
        if (RBanfibios.isSelected()) {
            try {
                App.setRoot(getClass().getResource("Anfibios/Anfibios.fxml"));
                App.getMainStage().setTitle("Anfibios");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (Rbmamifero.isSelected()){
            try {
                App.setRoot(getClass().getResource("Mamiferos/Mamiferos.fxml"));
                App.getMainStage().setTitle("Mamiferos");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (RBaves.isSelected()){
            try {
                App.setRoot(getClass().getResource("Aves/Aves.fxml"));
                App.getMainStage().setTitle("Aves");
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (RBaracnido.isSelected()) {
            try {
                App.setRoot(getClass().getResource("Aracnidos/Aracnidos.fxml"));
                App.getMainStage().setTitle("Aracnidos");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (RBinsectos.isSelected()) {
            try {
                App.setRoot(getClass().getResource("Insectos/Insectos.fxml"));
                App.getMainStage().setTitle("Insectos");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

