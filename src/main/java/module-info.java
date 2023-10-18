module com.TrabajoFinal.enciclopediaanimales {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens com.TrabajoFinal.enciclopediaanimales.controllers to javafx.fxml;
    exports com.TrabajoFinal.enciclopediaanimales.controllers;
    opens com.TrabajoFinal.enciclopediaanimales.utils to javafx.fxml;
    exports com.TrabajoFinal.enciclopediaanimales.utils;

}