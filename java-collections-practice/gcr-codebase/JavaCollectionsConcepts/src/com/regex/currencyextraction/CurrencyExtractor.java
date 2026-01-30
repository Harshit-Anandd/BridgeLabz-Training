package com.regex.currencyextraction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {
    public void extractCurrency(String text) {
        // Matches $ followed by digits, optionally followed by . and 2 digits
        String regex = "\\$\\d+(\\.\\d{2})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }
        if (!found) System.out.println("No currency values found.");
    }
}