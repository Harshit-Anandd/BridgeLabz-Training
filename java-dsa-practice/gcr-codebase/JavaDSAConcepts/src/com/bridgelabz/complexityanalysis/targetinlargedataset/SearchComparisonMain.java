package com.bridgelabz.complexityanalysis.targetinlargedataset;

public class SearchComparisonMain {

    public static void main(String[] args) {
        int size = 1_000_000; // Large dataset
        int[] dataset = new int[size];
        for (int i = 0; i < size; i++) dataset[i] = i; // Sorted data for Binary Search

        int target = size - 1; // Worst-case for Linear Search

        // Benchmark Linear Search
        long start = System.nanoTime();
        SearchComparison.linearSearch(dataset, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) + " ns");

        // Benchmark Binary Search
        start = System.nanoTime();
        SearchComparison.binarySearch(dataset, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) + " ns");
    }
}