package com.bridgelabz.day08.movietime;

public class ShowSorter {

    static void insertionSort(Show[] arr, int n) {
        for (int i = 1; i < n; i++) {
            Show key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].showTime > key.showTime) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}