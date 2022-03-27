package com.library.controllers;

import com.library.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddLibrarianController {
    @FXML
    private PasswordField textPassword;

    @FXML
    private Text textWarning;

    @FXML
    private TextField textName, textEmail, textAddress, textCity, textContact;

    @FXML
    private Button buttonBack, buttonAdd;

    @FXML
    private void HandleButtonAction (ActionEvent event) throws Exception{
        if(event.getSource() == buttonBack)
            SceneManager.loadScene((Stage) buttonBack.getScene().getWindow(), "adminMenu-view.fxml");
    }
}
