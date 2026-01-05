package com.bridgelabz.sorting.selectionsort;

public class ExamScoreSorter {
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the array [cite: 43]
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap it with the first unsorted element [cite: 44]
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }
    }

}