package com.bridgelabz.day02.bookshelf;

public class BookNode {
    String isbn;
    String title;
    String author;
    int quantity;
    BookNode next;

    BookNode(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.quantity = 1;
    }

    void increment() {
        quantity++;
    }

    boolean decrement() {
        if (quantity > 0) {
            quantity--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return title + " by " + author + " | ISBN: " + isbn + " | Qty: " + quantity;
    }
}