package com.bridgelabz.day06.artexpo;

public class ArtExpo {
	// Insertion Sort (ascending by registration time)
    public static void insertionSort(Artist[] artists, int n) {

        for (int i = 1; i < n; i++) {
            Artist key = artists[i];
            int j = i - 1;

            while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
                artists[j + 1] = artists[j];
                j--;
            }
            artists[j + 1] = key;
        }
    }
}