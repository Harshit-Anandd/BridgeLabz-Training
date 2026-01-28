package com.bridgelabz.day08.movietime;

public class Show {
    String movieName;
    int showTime; // HHMM

    Show(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    public String toString() {
        return movieName + " | Time: " + showTime;
    }
}