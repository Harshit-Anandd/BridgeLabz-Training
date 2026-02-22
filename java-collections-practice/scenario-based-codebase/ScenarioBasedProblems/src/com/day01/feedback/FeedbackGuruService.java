package com.day01.feedback;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuruService<T> {

    private static final Pattern RATING_PATTERN =
            Pattern.compile("(\\d+)/10");

    private Map<FeedbackCategory, List<String>> feedbackMap =
            new HashMap<>();

    public FeedbackGuruService() {
        for (FeedbackCategory c : FeedbackCategory.values()) {
            feedbackMap.put(c, new ArrayList<>());
        }
    }

    public void readFile(String filePath) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                processLine(line);
            }

        } catch (IOException e) {
            System.out.println("File read error.");
        }
    }

    private void processLine(String line) {

        Matcher matcher = RATING_PATTERN.matcher(line);

        if (!matcher.find()) {
            System.out.println("Skipping invalid line.");
            return;
        }

        int rating = Integer.parseInt(matcher.group(1));

        if (rating >= 8)
            feedbackMap.get(FeedbackCategory.POSITIVE).add(line);
        else if (rating >= 5)
            feedbackMap.get(FeedbackCategory.NEUTRAL).add(line);
        else
            feedbackMap.get(FeedbackCategory.NEGATIVE).add(line);
    }

    public void display() {

        feedbackMap.forEach((category, list) -> {
            System.out.println("\n" + category);
            list.forEach(System.out::println);
        });
    }
}