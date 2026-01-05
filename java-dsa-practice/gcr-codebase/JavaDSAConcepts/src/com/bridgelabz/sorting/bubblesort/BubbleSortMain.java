package com.bridgelabz.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSortMain {

    public static void main(String[] args) {
        int[] studentMarks = {85, 92, 78, 65, 88, 72};
        System.out.println("Original Marks: " + Arrays.toString(studentMarks));
        
        StudentMarksSorter.bubbleSort(studentMarks);
        
        System.out.println("Sorted Marks: " + Arrays.toString(studentMarks));
    }
    
}