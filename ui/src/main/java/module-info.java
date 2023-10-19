module com.enciclopedia.animales.ui {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.desktop;

    opens com.enciclopedia.animales.controllers to javafx.fxml;
    exports com.enciclopedia.animales.controllers;
    exports com.enciclopedia.animales.window;
    opens com.enciclopedia.animales.window to javafx.fxml;
}