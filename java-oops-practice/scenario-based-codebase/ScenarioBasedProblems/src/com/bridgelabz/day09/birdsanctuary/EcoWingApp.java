package com.bridgelabz.day09.birdsanctuary;

import java.util.Scanner;

public class EcoWingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdSanctuaryManager manager = new BirdSanctuaryManager();

        // Pre-loading some data
        manager.addBird(new Eagle("E01", "Thunder"));
        manager.addBird(new Penguin("P01", "Chilly"));
        manager.addBird(new Duck("D01", "Daffy"));
        manager.addBird(new Ostrich("O01", "Speedy"));

        while (true) {
            System.out.println("\n=== EcoWing Bird Sanctuary ===");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Remove Bird by ID");
            System.out.println("6. Sanctuary Report");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Types: 1.Eagle 2.Penguin 3.Duck 4.Ostrich");
                    System.out.print("Select Type: ");
                    int type = scanner.nextInt();
                    System.out.print("Enter ID: ");
                    String id = scanner.next();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();

                    switch (type) {
                        case 1 -> manager.addBird(new Eagle(id, name));
                        case 2 -> manager.addBird(new Penguin(id, name));
                        case 3 -> manager.addBird(new Duck(id, name));
                        case 4 -> manager.addBird(new Ostrich(id, name));
                        default -> System.out.println("Invalid Type.");
                    }
                    break;
                case 2: manager.displayAllBirds(); break;
                case 3: manager.displayFlyables(); break;
                case 4: manager.displaySwimmables(); break;
                case 5:
                    System.out.print("Enter Bird ID to remove: ");
                    manager.removeBird(scanner.next());
                    break;
                case 6: manager.generateReport(); break;
                case 7: 
                    System.out.println("Exiting System. Goodbye!");
                    scanner.close();
                    return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}