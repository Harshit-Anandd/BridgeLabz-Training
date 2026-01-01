package com.bridgelabz.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B001", "Java Programming", "Author X"));
        items.add(new DVD("D001", "Inception", "Nolan"));

        System.out.println("--- Library Items ---");
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            
            if (item instanceof Reservable) {
                ((Reservable) item).reserveItem();
            }
            System.out.println("---------------");
        }
        sc.close();
    }
}