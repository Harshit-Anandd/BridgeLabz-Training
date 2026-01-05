package com.bridgelabz.sorting.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] examScores = {55, 89, 42, 76, 95, 63};
        System.out.println("Original Scores: " + Arrays.toString(examScores));
        
        ExamScoreSorter.selectionSort(examScores);
        
        System.out.println("Sorted Scores: " + Arrays.toString(examScores));
    }
    
}