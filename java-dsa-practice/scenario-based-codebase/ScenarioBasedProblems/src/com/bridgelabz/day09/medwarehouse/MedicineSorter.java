package com.bridgelabz.day09.medwarehouse;

public class MedicineSorter {

    static void mergeSort(Medicine[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(Medicine[] arr, int l, int m, int r) {

        Medicine[] L = new Medicine[m - l + 1];
        Medicine[] R = new Medicine[r - m];

        for (int i = 0; i < L.length; i++) L[i] = arr[l + i];
        for (int j = 0; j < R.length; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < L.length && j < R.length) {
            arr[k++] = (L[i].expiryDate <= R[j].expiryDate) ? L[i++] : R[j++];
        }
        while (i < L.length) arr[k++] = L[i++];
        while (j < R.length) arr[k++] = R[j++];
    }
}