package com.bridgelabz.searching.challenge.missingtarget;

public class MissingTarget {
    
    // Part 1: Linear Search for Missing Positive
    public static int findMissingPositive(int[] nums) {
        // Find max to size array
        int max = 0;
        for(int n : nums) if(n > max) max = n;
        
        // Boolean array to mark visited positive integers
        // size max + 2 to handle case where all 1..max are present
        boolean[] present = new boolean[max + 2];
        
        for (int num : nums) {
            if (num > 0) present[num] = true;
        }

        // Find first false index starting from 1
        for (int i = 1; i < present.length; i++) {
            if (!present[i]) return i;
        }
        return 1; // Default
    }

    // Part 2: Binary Search
    public static int binarySearch(int[] sortedArr, int target) {
        int left = 0, right = sortedArr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedArr[mid] == target) return mid;
            if (sortedArr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}