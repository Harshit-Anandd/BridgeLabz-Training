package com.bridgelabz.day01.bookshelf;

public class BookNode {
    private String isbn;
    private String title;
    private String author;
    private int quantity;
    BookNode next;

    public BookNode(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.quantity = 1;
        this.next = null;
    }

    public String getIsbn() {
        return isbn;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public boolean decrementQuantity() {
        if (quantity > 0) {
            quantity--;
            return true;
        }
        return false;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return title + " by " + author + " | ISBN: " + isbn + " | Qty: " + quantity;
    }
}
