package com.day01.resume;

import java.util.*;
import java.util.regex.*;

public class ResumeParser {

    private static final Pattern EMAIL =
            Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z]{2,6}\\b",
                    Pattern.CASE_INSENSITIVE);

    private static final Pattern PHONE =
            Pattern.compile("\\b\\d{10}\\b");

    private static final Pattern KEYWORDS =
            Pattern.compile("\\b(Java|Python|Spring)\\b",
                    Pattern.CASE_INSENSITIVE);

    public static ResumeData parse(String content)
            throws InvalidResumeException {

        Matcher emailMatcher = EMAIL.matcher(content);
        Matcher phoneMatcher = PHONE.matcher(content);
        Matcher keywordMatcher = KEYWORDS.matcher(content);

        if (!emailMatcher.find())
            throw new InvalidResumeException("Missing email");

        if (!phoneMatcher.find())
            throw new InvalidResumeException("Missing phone");

        Set<String> skills = new HashSet<>();
        while (keywordMatcher.find())
            skills.add(keywordMatcher.group());

        return new ResumeData("Unknown",
                emailMatcher.group(),
                phoneMatcher.group(),
                skills);
    }
}