// Create class EBook that extends Book to demonstrate inheritance and access modifiers.

package com.bridgelabz.accessmodifiers;

public class EBook extends Book {
    // Constructor to initialize EBook by calling parent class constructor
    public EBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    // Method to display EBook information using different access levels
    public void displayEBookInfo() {
        // Access protected field from parent class
        System.out.println("EBook Title: " + title);
        // Access public field from parent class
        System.out.println("ISBN: " + isbn);
        // Access private field through public getter method
        System.out.println("Author: " + getAuthor());
    }

    // Main method to test EBook class
    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16", "Digital Learning", "Dr. Bob");
        ebook.displayEBookInfo();
    }
}