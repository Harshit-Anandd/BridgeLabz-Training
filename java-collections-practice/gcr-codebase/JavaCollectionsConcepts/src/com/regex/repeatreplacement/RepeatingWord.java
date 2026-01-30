package com.regex.repeatreplacement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWord {
    public void findRepeats(String text) {
        // \1 matches the content of the first capturing group (\w+)
        String regex = "\\b(\\w+)\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("Repeated word: " + matcher.group(1));
            found = true;
        }
        if (!found) System.out.println("No immediate repeats found.");
    }
}