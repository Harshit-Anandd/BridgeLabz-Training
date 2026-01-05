package com.bridgelabz.sorting.quicksort;

public class ProductPriceSorter {
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // Partition the array [cite: 37, 293]
            int pi = partition(prices, low, high);

            // Recursively apply Quick Sort on left and right partitions [cite: 38, 294]
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Pick a pivot element (using last element here) [cite: 36, 303]
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

}