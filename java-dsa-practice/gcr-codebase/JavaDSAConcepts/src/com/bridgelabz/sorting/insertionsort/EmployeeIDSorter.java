package com.bridgelabz.sorting.insertionsort;

public class EmployeeIDSorter {
    public static void insertionSort(int[] ids) {
        int n = ids.length;
        // Pick an element from the unsorted part [cite: 17, 170]
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            // Shift elements in the sorted portion to make space [cite: 144, 175]
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            // Insert the picked element into its correct position [cite: 145, 181]
            ids[j + 1] = key;
        }
    }

}