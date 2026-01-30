package com.collections.listinterface;
import java.util.*;

public class ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        
        System.out.println("Enter strings (type 'done' to finish):");
        while (true) {
            String input = sc.next();
            if (input.equals("done")) break;
            list.add(input);
        }
        
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String s : list) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }
        
        System.out.println("Frequencies: " + frequencyMap);
        sc.close();
    }
}