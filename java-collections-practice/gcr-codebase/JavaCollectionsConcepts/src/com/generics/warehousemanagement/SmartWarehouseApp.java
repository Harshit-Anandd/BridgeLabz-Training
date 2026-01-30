package com.generics.warehousemanagement;
import java.util.Scanner;
import java.util.List;

public class SmartWarehouseApp {
    // Wildcard method to display items
    public static void displayInventory(List<? extends WarehouseItem> items) {
        if (items.isEmpty()) {
            System.out.println("Storage is empty.");
        } else {
            for (WarehouseItem item : items) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Storage<Electronics> eStorage = new Storage<>();
        Storage<Groceries> gStorage = new Storage<>();
        Storage<Furniture> fStorage = new Storage<>();

        while (true) {
            System.out.println("\n--- Warehouse Menu ---");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Grocery");
            System.out.println("3. Add Furniture");
            System.out.println("4. View All Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Electronics Name: ");
                    String eName = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double ePrice = sc.nextDouble();
                    eStorage.addItem(new Electronics(eName, ePrice));
                    System.out.println("Electronics added.");
                    break;
                case 2:
                    System.out.print("Enter Grocery Name: ");
                    String gName = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double gPrice = sc.nextDouble();
                    gStorage.addItem(new Groceries(gName, gPrice));
                    System.out.println("Grocery added.");
                    break;
                case 3:
                    System.out.print("Enter Furniture Name: ");
                    String fName = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double fPrice = sc.nextDouble();
                    fStorage.addItem(new Furniture(fName, fPrice));
                    System.out.println("Furniture added.");
                    break;
                case 4:
                    System.out.println("\n--- Electronics ---");
                    displayInventory(eStorage.getItems());
                    System.out.println("\n--- Groceries ---");
                    displayInventory(gStorage.getItems());
                    System.out.println("\n--- Furniture ---");
                    displayInventory(fStorage.getItems());
                    break;
                case 5:
                    System.out.println("Exiting Warehouse System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}