package com.bridgelabz.day08.gamerzone;

public class PlayerSorter {

    static void quickSort(Player[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(Player[] arr, int low, int high) {
        int pivot = arr[high].score;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].score > pivot) {
                i++;
                Player t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        Player t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;
        return i + 1;
    }
}