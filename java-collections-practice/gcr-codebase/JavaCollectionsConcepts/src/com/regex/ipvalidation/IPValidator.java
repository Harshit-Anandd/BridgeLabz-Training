package com.regex.ipvalidation;
import java.util.regex.Pattern;

public class IPValidator {
    public boolean isValidIP(String ip) {
        // Matches 0-255 in four groups separated by dots
        String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        String regex = "^" + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "$";
        return Pattern.matches(regex, ip);
    }
}