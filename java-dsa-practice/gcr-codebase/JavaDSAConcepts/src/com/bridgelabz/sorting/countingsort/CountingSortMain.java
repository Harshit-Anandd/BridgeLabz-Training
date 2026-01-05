package com.bridgelabz.sorting.countingsort;

import java.util.Arrays;

public class CountingSortMain {

    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 15, 14, 12, 11};
        System.out.println("Original Ages: " + Arrays.toString(studentAges));
        
        AgeSorter.countingSort(studentAges);
        
        System.out.println("Sorted Ages: " + Arrays.toString(studentAges));
    }
    
}