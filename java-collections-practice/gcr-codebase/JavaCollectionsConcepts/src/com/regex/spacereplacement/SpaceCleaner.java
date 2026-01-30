package com.regex.spacereplacement;

public class SpaceCleaner {
    public String cleanSpaces(String text) {
        // \s+ matches one or more whitespace characters
        return text.replaceAll("\\s+", " ");
    }
}