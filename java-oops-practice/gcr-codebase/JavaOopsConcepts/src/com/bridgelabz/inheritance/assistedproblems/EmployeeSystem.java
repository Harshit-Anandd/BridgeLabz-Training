package com.bridgelabz.inheritance.assistedproblems;

import java.util.Scanner;
public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Create: 1. Manager, 2. Developer");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        if (type == 1) {
            System.out.print("Team Size: ");
            int size = sc.nextInt();
            Manager m = new Manager(name, id, salary, size);
            m.displayDetails();
        } else {
            System.out.print("Programming Language: ");
            String lang = sc.next();
            Developer d = new Developer(name, id, salary, lang);
            d.displayDetails();
        }
        sc.close();
    }
}