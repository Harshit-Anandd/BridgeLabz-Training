package com.bridgelabz.sorting.countingsort;

public class AgeSorter {
    public static void countingSort(int[] ages) {
        int n = ages.length;
        
        // Define range of ages (10 to 18) [cite: 60]
        int min = 10;
        int max = 18;
        int range = max - min + 1;
        
        // Create a count array [cite: 62]
        int[] count = new int[range];
        int[] output = new int[n];

        // Store count of each age
        for (int i = 0; i < n; i++) {
            count[ages[i] - min]++;
        }

        // Compute cumulative frequencies [cite: 62]
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in their correct positions in the output array [cite: 63]
        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        // Copy the sorted elements back to original array
        System.arraycopy(output, 0, ages, 0, n);
    }

}