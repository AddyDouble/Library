package com.library.controllers;

import com.library.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DeleteLibrarianController {

    @FXML
    private TextField textId;

    @FXML
    private Button buttonBack, buttonDelete;

    @FXML
    private void HandleButtonAction (ActionEvent event) throws Exception{
        if(event.getSource() == buttonBack)
            SceneManager.loadScene((Stage) buttonBack.getScene().getWindow(), "adminMenu-view.fxml");
    }
}
