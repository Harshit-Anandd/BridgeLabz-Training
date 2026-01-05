package com.bridgelabz.linkedlist.moviemanagementsystem;

public class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    public MovieNode(String t, String d, int y, double r) {
        this.title = t; this.director = d; this.year = y; this.rating = r;
        this.next = this.prev = null;
    }
}