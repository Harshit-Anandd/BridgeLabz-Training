package com.regex.colorvalidation;
import java.util.regex.Pattern;

public class HexColor {
    public boolean isValidHexColor(String color) {
        // Starts with #, followed by exactly 6 hex characters
        String regex = "^#([A-Fa-f0-9]{6})$";
        return Pattern.matches(regex, color);
    }
}