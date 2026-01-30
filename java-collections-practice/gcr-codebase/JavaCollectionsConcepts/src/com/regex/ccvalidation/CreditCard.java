package com.regex.ccvalidation;
import java.util.regex.Pattern;

public class CreditCard {
    public String validateCard(String number) {
        // Remove spaces or dashes first for validation check
        String cleanNum = number.replaceAll("[\\s-]", "");
        
        if (Pattern.matches("^4[0-9]{15}$", cleanNum)) {
            return "Valid Visa";
        } else if (Pattern.matches("^5[0-9]{15}$", cleanNum)) {
            return "Valid MasterCard";
        } else {
            return "Invalid Card";
        }
    }
}