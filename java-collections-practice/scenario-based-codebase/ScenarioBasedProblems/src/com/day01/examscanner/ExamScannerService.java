package com.day01.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScannerService {

    private static final Pattern LINE_PATTERN =
            Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

    private Map<String, Integer> scoreMap = new HashMap<>();

    public void processFile(String filePath,
                            List<String> answerKey) {

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                if (!LINE_PATTERN.matcher(line).matches()) {
                    throw new InvalidFormatException(
                            "Invalid format: " + line);
                }

                String[] parts = line.split(",");
                String studentName = parts[0].trim();

                int score = 0;

                for (int i = 1;
                     i < parts.length
                             && i <= answerKey.size();
                     i++) {

                    if (parts[i].equals(answerKey.get(i - 1))) {
                        score++;
                    }
                }

                scoreMap.put(studentName, score);
            }

        } catch (IOException e) {
            System.out.println("File read error.");
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displaySortedResults() {

        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>(
                        (a, b) -> b.getValue() - a.getValue());

        pq.addAll(scoreMap.entrySet());

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey()
                    + " → Score: "
                    + entry.getValue());
        }
    }
}