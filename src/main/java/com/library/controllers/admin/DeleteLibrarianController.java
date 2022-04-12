package com.library.controllers.admin;

import com.library.utils.DbConnection;
import com.library.utils.InputValidator;
import com.library.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.sql.RowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteLibrarianController {

    @FXML
    private TextField textId;

    @FXML
    private Button buttonBack, buttonDelete;

    @FXML
    private void HandleButtonAction (ActionEvent event) throws Exception{
        if(event.getSource() == buttonBack)
            SceneManager.loadScene((Stage) buttonBack.getScene().getWindow(), "admin/adminMenu-view.fxml");

        else if(event.getSource() == buttonDelete)
            deleteLibrarian();
    }

    private void deleteLibrarian(){
        if(!InputValidator.areTextFieldsValid(textId)){
            Alert a = new Alert(Alert.AlertType.ERROR, "Field can't be empty");
            a.show();
            return;
        }
        int id;
        try{
            id = Integer.parseInt(textId.getText().trim());
        }catch (Exception e){
            Alert a = new Alert(Alert.AlertType.ERROR, "Id must be an integer number");
            a.show();
            return;
        }
        try{
            Connection conn = DbConnection.Connect();
            Statement statement = conn.createStatement();
            ResultSet rowSet = statement.executeQuery("SELECT * FROM librarians WHERE Id = " + id);
            if(!rowSet.next()){
                Alert a = new Alert(Alert.AlertType.ERROR, "No record with given id");
                a.show();
                return;
            }
            statement.executeUpdate("DELETE FROM librarians WHERE Id = " + id);
            Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Record has been deleted");
            a.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
