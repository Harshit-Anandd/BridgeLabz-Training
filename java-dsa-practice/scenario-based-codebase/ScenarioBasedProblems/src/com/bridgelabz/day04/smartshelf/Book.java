package com.bridgelabz.day04.smartshelf;

public class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}