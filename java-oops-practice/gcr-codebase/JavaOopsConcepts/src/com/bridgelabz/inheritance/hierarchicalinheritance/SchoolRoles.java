package com.bridgelabz.inheritance.hierarchicalinheritance;

import java.util.Scanner;
public class SchoolRoles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Teacher t = new Teacher("Mr. Smith", 35, "Physics");
        Student s = new Student("Alice", 16, "10th");

        t.displayRole();
        s.displayRole();
        
        sc.close();
    }
}