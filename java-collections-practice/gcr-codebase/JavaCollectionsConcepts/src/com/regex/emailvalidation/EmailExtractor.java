package com.regex.emailvalidation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    public void extractEmails(String text) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("Found Email: " + matcher.group());
            found = true;
        }
        if (!found) System.out.println("No emails found.");
    }
}