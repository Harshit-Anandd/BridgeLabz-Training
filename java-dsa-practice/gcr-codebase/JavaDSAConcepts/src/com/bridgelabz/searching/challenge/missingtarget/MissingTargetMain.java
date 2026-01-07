package com.bridgelabz.searching.challenge.missingtarget;

public class MissingTargetMain {
    public static void main(String[] args) {
        int[] unsorted = {3, 4, -1, 1};
        System.out.println("First Missing Positive: " + MissingTarget.findMissingPositive(unsorted)); // Output: 2

        int[] sorted = {1, 2, 3, 4, 5, 6};
        System.out.println("Index of 5: " + MissingTarget.binarySearch(sorted, 5)); // Output: 4
    }
}