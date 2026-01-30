package com.collections.setinterface;
import java.util.*;

public class SetEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        System.out.println("Enter Set 1 elements (-1 to stop):");
        while(true) { int n = sc.nextInt(); if(n==-1) break; set1.add(n); }
        
        System.out.println("Enter Set 2 elements (-1 to stop):");
        while(true) { int n = sc.nextInt(); if(n==-1) break; set2.add(n); }
        
        boolean isEqual = set1.equals(set2);
        System.out.println("Are sets equal? " + isEqual);
        sc.close();
    }
}