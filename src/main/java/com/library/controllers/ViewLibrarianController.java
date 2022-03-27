package com.library.controllers;

import com.library.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ViewLibrarianController {
    @FXML
    private TableView tableLibrarians;

    @FXML
    private Button buttonBack;

    @FXML
    private void HandleButtonAction (ActionEvent event) throws Exception{
            if(event.getSource() == buttonBack)
                SceneManager.loadScene((Stage) buttonBack.getScene().getWindow(), "adminMenu-view.fxml");
    }
}
