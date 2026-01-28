package com.bridgelabz.day08.foodfest;

public class StallSorter {

    static void mergeSort(Stall[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(Stall[] arr, int l, int m, int r) {

        Stall[] L = new Stall[m - l + 1];
        Stall[] R = new Stall[r - m];

        for (int i = 0; i < L.length; i++) L[i] = arr[l + i];
        for (int j = 0; j < R.length; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < L.length && j < R.length) {
            arr[k++] = (L[i].footfall >= R[j].footfall) ? L[i++] : R[j++];
        }
        while (i < L.length) arr[k++] = L[i++];
        while (j < R.length) arr[k++] = R[j++];
    }
}