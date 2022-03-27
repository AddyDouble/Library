package com.library.utils;

import javafx.scene.control.TextInputControl;

public class InputValidator {
    public static boolean areTextFieldsValid (TextInputControl... fields){
        for (TextInputControl f: fields){
            if(f == null || f.getText().trim().length() == 0)
                return false;
        }
        return true;
    }
}
