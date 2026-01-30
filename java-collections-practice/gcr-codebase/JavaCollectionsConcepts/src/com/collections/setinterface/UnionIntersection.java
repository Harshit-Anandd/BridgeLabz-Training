package com.collections.setinterface;
import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        System.out.println("Enter Set 1 (-1 to stop):");
        while(true) { int n = sc.nextInt(); if(n==-1) break; set1.add(n); }
        
        System.out.println("Enter Set 2 (-1 to stop):");
        while(true) { int n = sc.nextInt(); if(n==-1) break; set2.add(n); }
        
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);
        
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
        sc.close();
    }
}