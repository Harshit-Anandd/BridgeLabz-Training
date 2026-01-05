package com.bridgelabz.linkedlist.moviemanagementsystem;

public class MovieManagement {
    MovieNode head, tail;

    // 1. Add Movie
    public void addMovie(String t, String d, int y, double r) {
        MovieNode newNode = new MovieNode(t, d, y, r);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // 2. Remove by Title
    public void removeMovie(String title) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                if (current.prev != null) current.prev.next = current.next;
                else head = current.next; // Head case

                if (current.next != null) current.next.prev = current.prev;
                else tail = current.prev; // Tail case
                
                return;
            }
            current = current.next;
        }
    }

    // 4. Display Forward and Reverse
    public void displayForward() {
        System.out.println("Forward List:");
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        System.out.println("Reverse List:");
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.prev;
        }
    }
}