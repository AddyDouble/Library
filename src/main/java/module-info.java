module com.library {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires mssql.jdbc;
    requires jtds;

    opens com.library to javafx.fxml;
    exports com.library;
    exports com.library.controllers;
    exports com.library.models;
    opens com.library.controllers to javafx.fxml;
    opens com.library.models to javafx.fxml;
}