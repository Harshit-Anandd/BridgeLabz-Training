package com.bridgelabz.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        while (!sc.hasNextInt()) { System.out.println("Invalid input."); sc.next(); }
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("1. Full Time 2. Part Time");
            int type = sc.nextInt();
            
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();

            if (type == 1) {
                System.out.print("Base Salary: ");
                double sal = sc.nextDouble();
                System.out.print("Bonus: ");
                double bonus = sc.nextDouble();
                FullTimeEmployee ft = new FullTimeEmployee(id, name, sal, bonus);
                ft.assignDepartment("Corporate");
                employees.add(ft);
            } else {
                System.out.print("Hours Worked: ");
                int hours = sc.nextInt();
                System.out.print("Hourly Rate: ");
                double rate = sc.nextDouble();
                PartTimeEmployee pt = new PartTimeEmployee(id, name, hours, rate);
                pt.assignDepartment("Operations");
                employees.add(pt);
            }
        }

        // Polymorphism: Processing list of employees
        System.out.println("\n--- Payroll Details ---");
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Total Salary: " + e.calculateSalary());
            if (e instanceof Department) {
                System.out.println("Dept: " + ((Department) e).getDepartmentDetails());
            }
            System.out.println("----------------");
        }
        sc.close();
    }
}