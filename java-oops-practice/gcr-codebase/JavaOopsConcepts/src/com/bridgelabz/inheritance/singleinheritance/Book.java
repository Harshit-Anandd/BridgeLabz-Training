package com.bridgelabz.inheritance.singleinheritance;

public class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Year: " + publicationYear);
    }
}