package com.indivaragroup.examtwenty;

import java.util.regex.Pattern;

public class PasswordValidator {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
    public static boolean isPasswordStrong(String password) {
        if (password == null) return false;
        return Pattern.matches(PASSWORD_PATTERN, password);
    }
}
