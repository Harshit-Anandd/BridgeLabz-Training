package com.regex.languageextraction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LanguageExtractor {
    public void extractLanguages(String text) {
        // Regex for common languages mentioned in example
        String regex = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C|Ruby|Swift|Rust)\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
            found = true;
        }
        if (!found) System.out.println("No known languages found.");
    }
}