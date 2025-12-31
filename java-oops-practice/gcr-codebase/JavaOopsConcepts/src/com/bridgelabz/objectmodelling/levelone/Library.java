package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;
public class Library {
    private String libraryName;
    private List<Book> books; // Aggregation

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add an existing book to the library
    public void addBook(Book book) {
        this.books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        if (books.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            for (Book b : books) {
                System.out.println(" - " + b.getInfo());
            }
        }
    }
}