package com.bridgelabz.day07.eduresult;

public class ResultSorter {

    static void mergeSort(Result[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(Result[] arr, int l, int m, int r) {
        Result[] L = new Result[m - l + 1];
        Result[] R = new Result[r - m];

        for (int i = 0; i < L.length; i++) L[i] = arr[l + i];
        for (int j = 0; j < R.length; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < L.length && j < R.length) {
            arr[k++] = (L[i].marks >= R[j].marks) ? L[i++] : R[j++];
        }
        while (i < L.length) arr[k++] = L[i++];
        while (j < R.length) arr[k++] = R[j++];
    }
}