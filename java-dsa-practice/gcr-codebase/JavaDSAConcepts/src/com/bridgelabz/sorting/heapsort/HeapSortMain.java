package com.bridgelabz.sorting.heapsort;

import java.util.Arrays;

public class HeapSortMain {

    public static void main(String[] args) {
        int[] salaries = {50000, 120000, 75000, 40000, 90000};
        System.out.println("Original Salaries: " + Arrays.toString(salaries));
        
        SalarySorter.heapSort(salaries);
        
        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
    }
    
}