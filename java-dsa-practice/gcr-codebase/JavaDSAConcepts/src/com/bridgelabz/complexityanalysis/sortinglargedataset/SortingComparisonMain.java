package com.bridgelabz.complexityanalysis.sortinglargedataset;

import java.util.Random;

public class SortingComparisonMain {
	public static void main(String[] args) {
        int size = 10_000; // Reduced size for Bubble Sort feasibility
        int[] data1 = new Random().ints(size).toArray();
        int[] data2 = data1.clone();

        long start = System.currentTimeMillis();
        SortingComparison.bubbleSort(data1);
        long end = System.currentTimeMillis();
        System.out.println("Bubble Sort Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        SortingComparison.mergeSort(data2, 0, data2.length - 1);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort Time: " + (end - start) + " ms");
    }
}