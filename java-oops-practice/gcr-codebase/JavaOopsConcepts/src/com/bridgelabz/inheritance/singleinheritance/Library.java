package com.bridgelabz.inheritance.singleinheritance;

import java.util.Scanner;
public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        
        System.out.print("Enter Publication Year: ");
        int year = sc.nextInt();
        sc.nextLine(); // consume newline
        
        System.out.print("Enter Author Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Author Bio: ");
        String bio = sc.nextLine();

        // Author is a subclass of Book in this specific problem scenario
        Author authorBook = new Author(title, year, name, bio);
        
        System.out.println("\n--- Book Details ---");
        authorBook.displayInfo();
        
        sc.close();
    }
}