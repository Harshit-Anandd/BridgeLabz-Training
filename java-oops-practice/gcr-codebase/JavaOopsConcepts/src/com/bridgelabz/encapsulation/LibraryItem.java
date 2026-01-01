package com.bridgelabz.encapsulation;

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }

    public abstract int getLoanDuration(); // Abstract method

    public void getItemDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}