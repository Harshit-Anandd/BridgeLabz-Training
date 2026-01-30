package com.collections.mapinterface;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text (single line):");
        if(sc.hasNextLine()) sc.nextLine(); // clear buffer
        String text = sc.nextLine();
        
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        
        for (String w : words) {
            if (!w.isEmpty()) freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        
        System.out.println("Frequency: " + freq);
        sc.close();
    }
}