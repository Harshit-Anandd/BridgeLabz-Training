package com.collections.mixedproblems.votingsystem;
import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votes = new HashMap<>();
        
        while(true) {
            System.out.println("\n1. Vote\n2. Show Results (Sorted)\n3. Exit");
            int ch = sc.nextInt();
            if (ch == 3) break;
            
            if (ch == 1) {
                System.out.print("Candidate Name: ");
                String name = sc.next();
                votes.put(name, votes.getOrDefault(name, 0) + 1);
            } else if (ch == 2) {
                // TreeMap sorts by key (Name), if sort by votes needed, requires custom comparator
                // Requirement says "TreeMap used to display results in sorted order"
                TreeMap<String, Integer> sorted = new TreeMap<>(votes); 
                System.out.println("Results: " + sorted);
            }
        }
        sc.close();
    }
}