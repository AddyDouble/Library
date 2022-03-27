package com.library.controllers;

import com.library.Main;
import com.library.utils.SceneManager;
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
            SceneManager.loadScene((Stage) buttonAdminLogin.getScene().getWindow(), "adminLogin-view.fxml");
        }
        else{
            SceneManager.loadScene((Stage) buttonLibrarianLogin.getScene().getWindow(), "librarianLogin-view.fxml");
        }
    }
}