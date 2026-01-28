package com.bridgelabz.day05.cinemahouse;

public class CinemaHouse {

    // Bubble Sort (ascending by show time)
    public static void bubbleSort(MovieShow[] shows, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (shows[j].showTime > shows[j + 1].showTime) {
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }
}