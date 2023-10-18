package com.TrabajoFinal.enciclopediaanimales.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PaginaPrincipal implements Initializable {

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



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {





    }

    @FXML
    private void CambiarScene(){
        if (RBanfibios.isSelected()) {
            try {
                ClasePincipal.setRoot(getClass().getResource("Anfibios/Anfibios.fxml"));
                ClasePincipal.getMainStage().setTitle("Anfibios");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (Rbmamifero.isSelected()){

            try {
                ClasePincipal.getMainStage().setTitle("Mamiferos");
                ClasePincipal.setRoot(getClass().getResource("Mamiferos/Mamiferos.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
