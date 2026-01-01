package com.bridgelabz.inheritance.singleinheritance;

public class Author extends Book {
    private String authorName;
    private String bio;

    public Author(String title, int year, String authorName, String bio) {
        super(title, year);
        this.authorName = authorName;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName);
        System.out.println("Bio: " + bio);
    }
}