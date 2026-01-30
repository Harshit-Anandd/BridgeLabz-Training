package com.regex.wordextraction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWord {
    public void extractCapitalized(String text) {
        // Matches word boundary, Uppercase letter, followed by any word characters
        String regex = "\\b[A-Z][a-zA-Z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }
        if (!found) System.out.println("No capitalized words found.");
    }
}