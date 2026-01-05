package com.bridgelabz.linkedlist.librarymanagementsystem;

public class LibraryManagement {
    BookNode head, tail;

    public void addBook(int id, String t, String a) {
        BookNode newNode = new BookNode(id, t, a);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // 2. Remove Book
    public void removeBook(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;

                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // 4. Update Status
    public void updateStatus(int id, String newStatus) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.status = newStatus;
                return;
            }
            temp = temp.next;
        }
    }
    
    // 6. Count Books
    public void countBooks() {
        int count = 0;
        BookNode temp = head;
        while(temp != null) { count++; temp = temp.next; }
        System.out.println("Total Books: " + count);
    }
    
}