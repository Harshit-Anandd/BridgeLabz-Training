package com.collections.setinterface;
import java.util.*;

public class SubsetChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        System.out.println("Enter Set 1 (Potential Subset) (-1 to stop):");
        while(true) { int n = sc.nextInt(); if(n==-1) break; set1.add(n); }
        
        System.out.println("Enter Set 2 (Superset) (-1 to stop):");
        while(true) { int n = sc.nextInt(); if(n==-1) break; set2.add(n); }
        
        boolean isSubset = set2.containsAll(set1);
        System.out.println("Is Set 1 a subset of Set 2? " + isSubset);
        sc.close();
    }
}