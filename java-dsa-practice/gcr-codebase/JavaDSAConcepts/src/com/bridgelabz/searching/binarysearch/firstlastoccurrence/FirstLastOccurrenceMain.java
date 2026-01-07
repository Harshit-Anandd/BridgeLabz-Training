package com.bridgelabz.searching.binarysearch.firstlastoccurrence;

import java.util.Arrays;

public class FirstLastOccurrenceMain {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println("Range: " + Arrays.toString(FirstLastOccurrence.searchRange(nums, 8))); // [3, 4]
    }
}
