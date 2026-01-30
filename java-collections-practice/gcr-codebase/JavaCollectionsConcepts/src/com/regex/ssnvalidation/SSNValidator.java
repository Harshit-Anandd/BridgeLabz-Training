package com.regex.ssnvalidation;
import java.util.regex.Pattern;

public class SSNValidator {
    public boolean isValidSSN(String ssn) {
        // Format: 3 digits - 2 digits - 4 digits
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return Pattern.matches(regex, ssn);
    }
}