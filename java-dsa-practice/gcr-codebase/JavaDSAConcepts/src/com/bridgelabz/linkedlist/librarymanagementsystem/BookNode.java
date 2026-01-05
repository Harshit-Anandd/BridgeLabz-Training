package com.bridgelabz.linkedlist.librarymanagementsystem;

public class BookNode {
    int bookId;
    String title, author, status;
    BookNode next, prev;

    public BookNode(int id, String t, String a) {
        this.bookId = id; this.title = t; this.author = a;
        this.status = "Available";
        this.next = this.prev = null;
    }
}