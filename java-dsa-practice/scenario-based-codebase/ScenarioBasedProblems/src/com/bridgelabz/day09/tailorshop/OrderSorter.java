package com.bridgelabz.day09.tailorshop;

public class OrderSorter {

    static void insertionSort(Order[] arr, int n) {
        for (int i = 1; i < n; i++) {
            Order key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].deadline > key.deadline) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}