package com.TrabajoFinal.enciclopediaanimales.controllers;

import com.TrabajoFinal.enciclopediaanimales.utils.UtilsScene;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.ImageInput;
import javafx.scene.layout.AnchorPane;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    @FXML
    private Label text_title,text_username,text_contrasena;
    @FXML
    private PasswordField textField_contrasena;
    @FXML
    private TextField textField_username;
    @FXML
    private Button botton_ingresar;
    @FXML
    private AnchorPane forma1,forma2;
    @FXML
    private ImageInput imagen1,imagen2,imagen3;
    @FXML
    private void eventoKey(KeyEvent event){

    }

    @FXML
    private void eventAction(ActionEvent event){

    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void entrar() throws IOException {
        ClasePincipal.setRoot(getClass().getResource("Login/PaginaPrinciapl.fxml"));
    }


}
