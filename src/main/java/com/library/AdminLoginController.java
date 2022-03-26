package com.library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AdminLoginController {
    @FXML
    private Button buttonLogin, buttonBack;
    @FXML
    private TextField textName;
    @FXML
    private Text textWarning;

    @FXML
    private void HandleButtonAction (ActionEvent event) throws Exception{
        if(event.getSource() == buttonBack)
            backToMenu();

    }

    private void backToMenu() throws Exception{
        Stage stage = (Stage) buttonBack.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}
