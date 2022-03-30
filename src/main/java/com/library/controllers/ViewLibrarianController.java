package com.library.controllers;

import com.library.models.Librarian;
import com.library.utils.DbConnection;
import com.library.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ViewLibrarianController implements Initializable {
    @FXML
    private TableView<Librarian> tableLibrarians;

    @FXML
    private TableColumn<Librarian, Integer> Id;

    @FXML
    private TableColumn<Librarian, String> name, password, email, address, city, contact_no;

    @FXML
    private Button buttonBack;

    @FXML
    private void HandleButtonAction (ActionEvent event) throws Exception{
            if(event.getSource() == buttonBack)
                SceneManager.loadScene((Stage) buttonBack.getScene().getWindow(), "adminMenu-view.fxml");
    }

    private void loadValues(){
        try(Connection conn = DbConnection.Connect();
            Statement statement = conn.createStatement();
            ResultSet rowSet = statement.executeQuery("SELECT * FROM librarians")
        ){
            while (rowSet.next()){

                Librarian l = new Librarian(
                        rowSet.getInt("Id"),
                        rowSet.getString("name"),
                        rowSet.getString("password"),
                        rowSet.getString("email"),
                        rowSet.getString("address"),
                        rowSet.getString("city"),
                        rowSet.getString("contact_no")
                );

                tableLibrarians.getItems().add(l);


            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        password.setCellValueFactory(new PropertyValueFactory<>("Password"));
        email.setCellValueFactory(new PropertyValueFactory<>("Email"));
        address.setCellValueFactory(new PropertyValueFactory<>("Address"));
        city.setCellValueFactory(new PropertyValueFactory<>("City"));
        contact_no.setCellValueFactory(new PropertyValueFactory<>("Contact_no"));
        loadValues();
    }
}
