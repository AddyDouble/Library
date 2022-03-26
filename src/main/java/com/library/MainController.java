package com.library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private Button buttonAdminLogin, buttonLibrarianLogin;

    @FXML
    private void handleButtonAction (ActionEvent event) throws Exception{
        Stage stage;
        FXMLLoader fxmlLoader;

        if(event.getSource() == buttonAdminLogin){
            stage = (Stage) buttonAdminLogin.getScene().getWindow();
            fxmlLoader = new FXMLLoader(Main.class.getResource("adminLogin-view.fxml"));
        }
        else{
            stage = (Stage) buttonLibrarianLogin.getScene().getWindow();
            fxmlLoader = new FXMLLoader(Main.class.getResource("librarianLogin-view.fxml"));
        }
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}