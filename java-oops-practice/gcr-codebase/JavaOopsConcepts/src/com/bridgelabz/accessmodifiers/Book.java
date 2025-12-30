//Create class Book to demonstrate access modifiers with book attributes.

package com.bridgelabz.accessmodifiers;

public class Book {
    public String isbn;
    protected String title;
    private String author;

    // Constructor to initialize Book attributes
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Getter method to retrieve author
    public String getAuthor() {
        return author;
    }

    // Setter method to update author
    public void setAuthor(String author) {
        this.author = author;
    }
}