package com.library.controllers;

import com.library.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import com.library.utils.InputValidator;

public class AdminLoginController {
    @FXML
    private Button buttonLogin, buttonBack;
    @FXML
    private TextField textName;
    @FXML
    private Text textWarning;
    @FXML
    private PasswordField textPassword;

    @FXML
    private void HandleButtonAction (ActionEvent event) throws Exception{
        if(event.getSource() == buttonBack)
            SceneManager.loadScene((Stage) buttonBack.getScene().getWindow(),"main-view.fxml");
        else if(event.getSource() == buttonLogin){
            loginAdmin();
        }
    }

    private void loginAdmin() throws Exception{

        textWarning.setText("");
        if(!InputValidator.areTextFieldsValid(textName, textPassword)){
            textWarning.setText("Login and password can't be empty");
            return;
        }
        else if(!textName.getText().equals("admin") || !textPassword.getText().equals("admin123")){
            textWarning.setText("Incorrect credentials. Try again");
            return;
        }

        SceneManager.loadScene((Stage) textWarning.getScene().getWindow(), "adminMenu-view.fxml");
    }

}
