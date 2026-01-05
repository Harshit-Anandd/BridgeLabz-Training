package com.bridgelabz.sorting.bubblesort;


public class StudentMarksSorter {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        // Traverse through the array multiple times [cite: 8, 111]
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Compare adjacent elements and swap if needed [cite: 9, 113]
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j+1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            // Optimization: Stop if no swaps occurred [cite: 122]
            if (!swapped) break;
        }
    }

}