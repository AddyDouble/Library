package com.library.controllers.admin;

import com.library.utils.DbConnection;
import com.library.utils.InputValidator;
import com.library.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
            SceneManager.loadScene((Stage) buttonBack.getScene().getWindow(), "admin/adminMenu-view.fxml");

        else if(event.getSource() == buttonAdd)
            addLibrarian();
    }

    private void addLibrarian(){
        if(!InputValidator.areTextFieldsValid(textName, textPassword, textEmail, textAddress, textCity, textContact)){
            textWarning.setText("All fields must be filled out");
            return;
        }
        if(!InputValidator.isValidEmail(textEmail)){
            textWarning.setText("Incorrect email format");
            return;
        }

        if(textName.getText().trim().length() > 32){
            textWarning.setText("Name can't be longer than 32");
            return;
        }
        else if(textPassword.getText().trim().length() > 32){
            textWarning.setText("Password can't be longer than 32");
            return;
        }
        else if(textEmail.getText().trim().length() > 32){
            textWarning.setText("Email can't be longer than 32");
            return;
        }
        else if(textAddress.getText().trim().length() > 50){
            textWarning.setText("Address can't be longer than 50");
            return;
        }
        else if(textCity.getText().trim().length() > 32){
            textWarning.setText("City can't be longer than 32");
            return;
        }
        else if(textContact.getText().trim().length() > 10){
            textWarning.setText("Contact_no can't be longer than 10");
            return;
        }


        try {
            Connection conn = DbConnection.Connect();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO librarians VALUES(?,?,?,?,?,?)");
            statement.setString(1, textName.getText().trim());
            statement.setString(2, textPassword.getText().trim());
            statement.setString(3, textEmail.getText().trim());
            statement.setString(4, textAddress.getText().trim());
            statement.setString(5, textCity.getText().trim());
            statement.setString(6, textContact.getText().trim());
            statement.executeUpdate();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Librarian sucessfully added");
            alert.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
