package com.bridgelabz.constructors;

//Create class Book to demonstrate default and parameterized constructors.
public class Book {
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Price: $" + this.price);
    }

    public static void main(String[] args) {

        // Using Default Constructor
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        // Using Parameterized Constructor
        Book paramBook = new Book("Effective Java", "Joshua Bloch", 45.00);
        paramBook.displayDetails();
    }
}