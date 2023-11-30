package com.enciclopedia.animales.controllers;

import com.enciclopedia.animales.models.Animal;
import com.enciclopedia.animales.window.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Favoritos implements Initializable {
    @FXML
    private TableView<Animal> tableView;
    @FXML
    private TableColumn<Animal, String> nombreColumn, familiaColumn, generoColumn, habitatColumn;

    private ObservableList<Animal> favoritos = FXCollections.observableArrayList();

    @Override
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
        favoritos.addAll(com.enciclopedia.animales.conexion.Conexion.getInstancia().getFavoritos());

        tableView.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                mostrarAnimal();
            }
        });

        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombreAnimal"));
        familiaColumn.setCellValueFactory(new PropertyValueFactory<>("familia"));
        generoColumn.setCellValueFactory(new PropertyValueFactory<>("genero"));
        habitatColumn.setCellValueFactory(new PropertyValueFactory<>("habitad"));

        tableView.setItems(favoritos);
    }

    @FXML
    private void retroceder() {
        App.irAPrincipal();
    }

    private void mostrarAnimal() {
        Animal animal = tableView.getSelectionModel().getSelectedItem();
        if (animal != null) {
            VerAnimalController.lugarARegresar("Favoritos");
            VerAnimalController.setAnimal(animal);
            try {
                App.setRoot(getClass().getResource("Animal/Animal_a_mostrar.fxml"));
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error " + e.getMessage());
            }
        }
    }
}
