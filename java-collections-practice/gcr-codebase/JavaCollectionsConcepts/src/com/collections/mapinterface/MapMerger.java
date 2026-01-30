package com.collections.mapinterface;
import java.util.*;

public class MapMerger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        System.out.println("Map 1 entries (done 0 to stop):");
        while(true) { String k = sc.next(); if(k.equals("done")) break; map1.put(k, sc.nextInt()); }

        System.out.println("Map 2 entries (done 0 to stop):");
        while(true) { String k = sc.next(); if(k.equals("done")) break; map2.put(k, sc.nextInt()); }
        
        Map<String, Integer> merged = new HashMap<>(map1);
        map2.forEach((k, v) -> merged.merge(k, v, Integer::sum));
        
        System.out.println("Merged: " + merged);
        sc.close();
    }
}