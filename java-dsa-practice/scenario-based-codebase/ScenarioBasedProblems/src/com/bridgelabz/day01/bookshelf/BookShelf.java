package com.bridgelabz.day01.bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BookShelf {

    private Map<String, BookLinkedList> catalog;
    private Set<String> globalIsbnRegistry;

    public BookShelf() {
        this.catalog = new HashMap<>();
        this.globalIsbnRegistry = new HashSet<>();
    }

    private BookLinkedList getOrCreateGenre(String genre) {
        return catalog.computeIfAbsent(genre, g -> new BookLinkedList());
    }


    // Add a new book (unique across all genres)
    public boolean addBook(String genre, String isbn, String title, String author) {

        if (globalIsbnRegistry.contains(isbn)) {
            System.out.println("Duplicate ISBN detected: " + isbn);
            return false;
        }

        BookLinkedList bookList = getOrCreateGenre(genre);
        bookList.addBook(isbn, title, author);
        globalIsbnRegistry.add(isbn);

        return true;
    }

    // Borrow a book from a genre
    public boolean borrowBook(String genre, String isbn) {
        BookLinkedList bookList = catalog.get(genre);

        if (bookList == null) {
            return false;
        }

        return bookList.borrowBook(isbn);
    }

    // Return a book to a genre
    public boolean returnBook(String genre, String isbn, String title, String author) {

        BookLinkedList bookList = catalog.get(genre);

        if (bookList == null) {
            return false;
        }

        bookList.returnBook(isbn, title, author);
        return true;
    }

    // Permanently remove a book
    public boolean removeBookCompletely(String genre, String isbn) {

        BookLinkedList bookList = catalog.get(genre);

        if (bookList == null) {
            return false;
        }

        boolean removed = bookList.removeAllCopies(isbn);

        if (removed) {
            globalIsbnRegistry.remove(isbn);
        }

        return removed;
    }


    public void displayGenre(String genre) {
        BookLinkedList bookList = catalog.get(genre);

        if (bookList == null || bookList.getSize() == 0) {
            System.out.println("No books found in genre: " + genre);
            return;
        }

        System.out.println("Genre: " + genre);
        bookList.displayBooks();
    }

    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Library catalog is empty.");
            return;
        }

        for (Map.Entry<String, BookLinkedList> entry : catalog.entrySet()) {
            System.out.println("\nGenre: " + entry.getKey());
            entry.getValue().displayBooks();
        }
    }
    
}