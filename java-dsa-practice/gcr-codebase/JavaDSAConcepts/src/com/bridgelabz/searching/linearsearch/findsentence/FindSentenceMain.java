package com.bridgelabz.searching.linearsearch.findsentence;

public class FindSentenceMain {

    public static void main(String[] args) {
        String[] data = {
            "Java is great",
            "Python is simple",
            "C++ is fast"
        };
        System.out.println(FindSentence.findSentenceWithWord(data, "simple")); // Output: Python is simple
    }
}
