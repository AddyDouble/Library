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

    public static boolean isValidEmail(TextInputControl email){
        if(email == null)
            return false;

        String s = email.getText().trim();
        if(s.length() == 0 || s.indexOf('@') == -1 || s.indexOf('@') == s.length()-1)
            return false;

        return true;
    }
}
