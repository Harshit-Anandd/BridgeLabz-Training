package com.bridgelabz.day01.bookshelf;

public class BookLinkedList {

    private BookNode head;
    private int size;
    
    public BookLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public BookNode findBookByIsbn(String isbn) {
        BookNode current = head;

        while (current != null) {
            if (current.getIsbn().equals(isbn)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    public void addBook(String isbn, String title, String author) {
        BookNode existingBook = findBookByIsbn(isbn);

        if (existingBook != null) {
            existingBook.incrementQuantity();
            return;
        }

        BookNode newNode = new BookNode(isbn, title, author);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public boolean borrowBook(String isbn) {
        BookNode current = head;
        BookNode previous = null;

        while (current != null) {
            if (current.getIsbn().equals(isbn)) {

                if (current.decrementQuantity()) {

                    if (current.getQuantity() == 0) {
                        if (previous == null) {
                            head = current.next;
                        } else {
                            previous.next = current.next;
                        }
                        size--;
                    }
                    return true;
                }
                return false;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }
    
    public void returnBook(String isbn, String title, String author) {
        BookNode book = findBookByIsbn(isbn);

        if (book != null) {
            book.incrementQuantity();
        } else {
            addBook(isbn, title, author);
        }
    }
    
    public void displayBooks() {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }

        BookNode current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean removeAllCopies(String isbn) {
        BookNode current = head;
        BookNode previous = null;

        while (current != null) {
            if (current.getIsbn().equals(isbn)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

}