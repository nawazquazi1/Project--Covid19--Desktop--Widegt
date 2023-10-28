module com.covid.covid19 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires com.google.gson;
    requires retrofit2;

    opens com.covid.covid19.controller to javafx.fxml;
    exports com.covid.covid19;
}