package com.enciclopedia.animales.controllers;


import com.enciclopedia.animales.conexion.Conexion;
import com.enciclopedia.animales.window.App;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Registro {
    @FXML
    private PasswordField textField_RContrasena;
    @FXML
    private TextField textField_RUsuario;

    @FXML
    private void registrar() {
        String username = textField_RUsuario.getText();
        String contrasena = textField_RContrasena.getText();

        Connection connection = Conexion.getInstancia().getConnection();
        try {
            Statement statement = connection.createStatement();
            boolean result = statement.execute("CALL AgregarUsuario('" + username + "', '" + contrasena + "')");
            if (!result) {
                JOptionPane.showMessageDialog(null,"Usuario registrado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null,"Error en el registro");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    private void RegresoLogin(){
        try {
            App.setRoot(getClass().getResource("Login/Login.fxml"));
            App.getMainStage().setTitle("Registro");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}