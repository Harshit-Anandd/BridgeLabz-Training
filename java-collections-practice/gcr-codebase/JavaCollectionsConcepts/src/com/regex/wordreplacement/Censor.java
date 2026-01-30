package com.regex.wordreplacement;

public class Censor {
    public String censorWords(String text, String[] badWords) {
        String result = text;
        for (String word : badWords) {
            // \\b ensures we only replace whole words, (?i) for case insensitivity
            String regex = "(?i)\\b" + word + "\\b";
            result = result.replaceAll(regex, "****");
        }
        return result;
    }
}