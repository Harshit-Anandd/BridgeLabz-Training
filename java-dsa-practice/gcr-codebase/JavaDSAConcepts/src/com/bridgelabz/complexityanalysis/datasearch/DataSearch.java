package com.bridgelabz.complexityanalysis.datasearch;

import java.util.*;

public class DataSearch {
    public static void main(String[] args) {
        int size = 1_000_000;
        int target = size - 1; // Element at the end

        List<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }

        // Array Search: O(N)
        long start = System.nanoTime();
        arrayList.contains(target);
        long end = System.nanoTime();
        System.out.println("ArrayList Search: " + (end - start) + " ns");

        // HashSet Search: O(1)
        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start) + " ns");

        // TreeSet Search: O(log N)
        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start) + " ns");
    }
}