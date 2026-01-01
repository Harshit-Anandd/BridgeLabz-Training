package com.bridgelabz.encapsulation;

public class DVD extends LibraryItem {
    public DVD(String id, String title, String director) { super(id, title, director); }

    @Override
    public int getLoanDuration() { return 7; } // 7 days for DVDs
}