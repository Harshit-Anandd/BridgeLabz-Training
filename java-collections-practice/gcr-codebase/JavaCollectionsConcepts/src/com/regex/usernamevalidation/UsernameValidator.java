package com.regex.usernamevalidation;
import java.util.regex.Pattern;

public class UsernameValidator {
    public boolean isValidUsername(String username) {
        // Starts with a letter, allows letters, numbers, underscores, length 5-15
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return Pattern.matches(regex, username);
    }
}