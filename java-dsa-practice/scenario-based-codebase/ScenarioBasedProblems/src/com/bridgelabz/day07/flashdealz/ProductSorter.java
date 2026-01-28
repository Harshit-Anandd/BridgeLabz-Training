package com.bridgelabz.day07.flashdealz;

public class ProductSorter {

    static void quickSort(Product[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(Product[] arr, int low, int high) {
        int pivot = arr[high].discount;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].discount > pivot) {
                i++;
                Product t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        Product t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;
        return i + 1;
    }
}