package com.bridgelabz.day05.robowarehouse;

public class RoboWarehouse {
	// Insertion Sort (ascending by weight)
    public static void insertionSort(PackageBox[] boxes, int n) {

        for (int i = 1; i < n; i++) {
            PackageBox key = boxes[i];
            int j = i - 1;

            while (j >= 0 && boxes[j].weight > key.weight) {
                boxes[j + 1] = boxes[j];
                j--;
            }
            boxes[j + 1] = key;
        }
    }
}