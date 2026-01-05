package com.bridgelabz.linkedlist.inventorymanagementsystem;

public class InventoryMain {

	public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();
        im.addItem(1, "Laptop", 5, 1000);
        im.addItem(2, "Mouse", 50, 20);
        im.addItem(3, "Keyboard", 30, 50);

        im.display();
        im.calculateTotalValue();
        
        System.out.println("\nAfter Sorting by Name:");
        im.sortByName();
        im.display();
    }
	
}