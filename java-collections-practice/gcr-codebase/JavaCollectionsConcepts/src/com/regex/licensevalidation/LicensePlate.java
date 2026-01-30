package com.regex.licensevalidation;
import java.util.regex.Pattern;

public class LicensePlate {
    public boolean isValidLicensePlate(String plate) {
        // Starts with 2 uppercase letters, followed by 4 digits
        String regex = "^[A-Z]{2}\\d{4}$";
        return Pattern.matches(regex, plate);
    }
}