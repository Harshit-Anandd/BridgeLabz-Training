package com.bridgelabz.readers.filereader.countwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "src/com/bridgelabz/readers/filereader/countwords/sample.txt";
        String targetWord = "Java";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split line by whitespace
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Case-insensitive check (optional)
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
            System.out.println("Occurrences of '" + targetWord + "': " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}