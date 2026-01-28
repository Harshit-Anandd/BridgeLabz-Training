package com.bridgelabz.day07.fitnesstracker;

public class FitnessSorter {

    static void bubbleSort(UserSteps[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].steps < arr[j + 1].steps) {
                    UserSteps t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}