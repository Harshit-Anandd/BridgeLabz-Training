package com.bridgelabz.sorting.heapsort;

public class SalarySorter {
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build a Max Heap from the array [cite: 51]
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(salaries, n, i);

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Extract the largest element (root) and place it at the end [cite: 52]
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Reheapify the remaining elements [cite: 53]
            heapify(salaries, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is an index in arr[]. n is size of heap
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    
}