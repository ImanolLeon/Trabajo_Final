package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.ImageInput;
import javafx.scene.layout.AnchorPane;

public class Login {
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
    private void entrar() {
        App.irAPrincipal();
    }
}
