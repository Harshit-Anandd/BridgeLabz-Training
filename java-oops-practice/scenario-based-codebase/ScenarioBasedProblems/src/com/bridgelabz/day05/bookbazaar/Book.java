package com.bridgelabz.day05.bookbazaar;

// 2. Base Class: Book
public abstract class Book implements Discountable {
    protected String title;
    protected String author;
    protected double price;
    // Encapsulation: Stock logic is critical
    private int stock; 

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() { return title; }

    // Controlled stock reduction
    public boolean reduceStock(int qty) {
        if (stock >= qty) {
            stock -= qty;
            return true;
        }
        return false;
    }
}