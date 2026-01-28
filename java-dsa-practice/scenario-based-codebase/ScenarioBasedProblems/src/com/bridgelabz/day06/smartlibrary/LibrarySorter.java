package com.bridgelabz.day06.smartlibrary;

public class LibrarySorter {

    static void insertionSort(BorrowedBook[] arr, int n) {
        for (int i = 1; i < n; i++) {
            BorrowedBook key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].title.compareToIgnoreCase(key.title) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}