package com.bridgelabz.searching.linearsearch.findsentence;

public class FindSentence {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            // Check if sentence contains the word (case-sensitive)
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
}