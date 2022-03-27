package com.library.controllers;

import com.library.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdminMenuController {
    @FXML
    private Button buttonAddLibrarian, buttonViewLibrarian, buttonDeleteLibrarian, buttonLogout;

    @FXML
    private void HandleButtonAction (ActionEvent event) throws Exception{
        if(event.getSource() == buttonAddLibrarian)
            SceneManager.loadScene((Stage) buttonAddLibrarian.getScene().getWindow(), "addLibrarian-view.fxml");
        else if(event.getSource() == buttonViewLibrarian)
            SceneManager.loadScene((Stage) buttonViewLibrarian.getScene().getWindow(), "viewLibrarian-view.fxml");
        else if(event.getSource() == buttonDeleteLibrarian)
            SceneManager.loadScene((Stage) buttonDeleteLibrarian.getScene().getWindow(), "deleteLibrarian-view.fxml");
        else if(event.getSource() == buttonLogout)
            SceneManager.loadScene((Stage) buttonLogout.getScene().getWindow(), "main-view.fxml");

    }
}
