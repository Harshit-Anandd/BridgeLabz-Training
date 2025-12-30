package com.bridgelabz.constructors.levelone;

//Create class LibraryBook to manage book availability and borrowing operations.
public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    // Borrow book if available
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    // Display book availability status
    public void displayStatus() {
        System.out.println("Title: " + title + ", Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {

        // Create book object
        LibraryBook book = new LibraryBook("Java Programming", "Author A", 50.0);
        book.displayStatus();

        // Borrow the book
        book.borrowBook();
        book.displayStatus();

        // Attempt to borrow again
        book.borrowBook();
    }
}