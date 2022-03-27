module com.library {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.library to javafx.fxml;
    exports com.library;
    exports com.library.controllers;
    opens com.library.controllers to javafx.fxml;
}