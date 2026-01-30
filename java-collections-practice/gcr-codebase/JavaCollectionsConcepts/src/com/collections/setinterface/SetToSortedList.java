package com.collections.setinterface;
import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        
        System.out.println("Enter elements (-1 to stop):");
        while(true) { int n = sc.nextInt(); if(n==-1) break; set.add(n); }
        
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        System.out.println("Sorted List: " + list);
        sc.close();
    }
}