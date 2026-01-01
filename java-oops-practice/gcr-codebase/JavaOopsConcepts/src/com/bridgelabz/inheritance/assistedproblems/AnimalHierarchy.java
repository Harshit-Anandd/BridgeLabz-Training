package com.bridgelabz.inheritance.assistedproblems;

import java.util.Scanner;
public class AnimalHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose animal: 1. Dog, 2. Cat, 3. Bird");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Age: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid age.");
            sc.next();
        }
        int age = sc.nextInt();

        Animal animal;
        if (choice == 1) animal = new Dog(name, age);
        else if (choice == 2) animal = new Cat(name, age);
        else animal = new Bird(name, age);

        System.out.println("\n--- Animal Details ---");
        System.out.println("Name: " + animal.getName() + ", Age: " + animal.getAge());
        animal.makeSound(); // Polymorphic call

        sc.close();
    }
}