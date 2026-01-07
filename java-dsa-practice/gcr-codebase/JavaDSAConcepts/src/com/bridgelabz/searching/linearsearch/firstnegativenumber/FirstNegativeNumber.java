package com.bridgelabz.searching.linearsearch.firstnegativenumber;

public class FirstNegativeNumber {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // Return index immediately
            }
        }
        return -1; // Not found
    }
}