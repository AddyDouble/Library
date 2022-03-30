package com.library.utils;

import com.library.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {
    public static void loadScene(Stage stage, String fxml) throws Exception{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/" + fxml));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
            throw new Exception("Error while loading new scene");
        }
    }
}
