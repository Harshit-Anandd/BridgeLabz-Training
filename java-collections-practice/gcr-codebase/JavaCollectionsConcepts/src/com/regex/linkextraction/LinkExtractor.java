package com.regex.linkextraction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public void extractLinks(String text) {
        // Basic pattern for http/https URLs
        String regex = "https?://[\\w.-]+(?:\\.[\\w\\.-]+)+[\\w\\-\\._~:/?#[\\]@!\\$&'\\(\\)\\*\\+,;=.]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }
        if (!found) System.out.println("No links found.");
    }
}