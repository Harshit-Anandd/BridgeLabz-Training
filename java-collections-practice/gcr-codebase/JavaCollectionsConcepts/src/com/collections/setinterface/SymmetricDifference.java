package com.collections.setinterface;
import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        System.out.println("Enter Set 1 (-1 to stop):");
        while(true) { int n = sc.nextInt(); if(n==-1) break; set1.add(n); }
        
        System.out.println("Enter Set 2 (-1 to stop):");
        while(true) { int n = sc.nextInt(); if(n==-1) break; set2.add(n); }
        
        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2); // A - B
        
        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1); // B - A
        
        diff1.addAll(diff2);
        System.out.println("Symmetric Difference: " + diff1);
        sc.close();
    }
}