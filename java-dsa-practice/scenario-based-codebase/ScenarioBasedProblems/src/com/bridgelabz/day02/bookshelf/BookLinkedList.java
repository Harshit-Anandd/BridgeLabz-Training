package com.bridgelabz.day02.bookshelf;

public class BookLinkedList {

    private BookNode head;

    public void addBook(String isbn, String title, String author) {

        BookNode temp = head;
        while (temp != null) {
            if (temp.isbn.equals(isbn)) {
                temp.increment();
                return;
            }
            temp = temp.next;
        }

        BookNode book = new BookNode(isbn, title, author);
        book.next = head;
        head = book;
    }

    public boolean borrowBook(String isbn) {

        BookNode curr = head;
        BookNode prev = null;

        while (curr != null) {
            if (curr.isbn.equals(isbn)) {

                if (curr.decrement()) {
                    if (curr.quantity == 0) {
                        if (prev == null) head = curr.next;
                        else prev.next = curr.next;
                    }
                    return true;
                }
                return false;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    public void display() {

        if (head == null) {
            System.out.println("No books available.");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}