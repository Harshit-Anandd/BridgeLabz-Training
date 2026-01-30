package com.streams.wordscount;
import java.io.*;
import java.util.*;

public class TextAnalyzer {
	public void displayTopWords(String path) {
		Map<String, Integer> wordCounts = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.toLowerCase().split("\\W+");
				for (String word : words) {
					if (!word.isEmpty()) {
						wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
					}
				}
			}

			System.out.println("--- Top 5 Frequent Words ---");
			wordCounts.entrySet().stream()
			.sorted((a, b) -> b.getValue().compareTo(a.getValue()))
			.limit(5)
			.forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}