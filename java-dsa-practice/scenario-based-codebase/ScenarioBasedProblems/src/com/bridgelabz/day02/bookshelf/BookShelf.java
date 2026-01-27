package com.bridgelabz.day02.bookshelf;

import java.util.*;

public class BookShelf {

    private Map<String, BookLinkedList> catalog = new HashMap<>();
    private Set<String> isbnRegistry = new HashSet<>();

    public boolean addBook(String genre, String isbn, String title, String author) {

        if (isbnRegistry.contains(isbn)) {
            return false;
        }

        catalog.computeIfAbsent(genre, g -> new BookLinkedList())
               .addBook(isbn, title, author);

        isbnRegistry.add(isbn);
        return true;
    }

    public boolean borrowBook(String genre, String isbn) {

        BookLinkedList list = catalog.get(genre);
        if (list == null) return false;

        return list.borrowBook(isbn);
    }

    public void displayCatalog() {

        if (catalog.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (Map.Entry<String, BookLinkedList> entry : catalog.entrySet()) {
            System.out.println("\nGenre: " + entry.getKey());
            entry.getValue().display();
        }
    }
}