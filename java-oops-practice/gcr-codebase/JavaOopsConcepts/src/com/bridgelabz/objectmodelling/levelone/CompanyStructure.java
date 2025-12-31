package com.bridgelabz.objectmodelling.levelone;

import java.util.Scanner;
public class CompanyStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Company Name: ");
        Company comp = new Company(sc.nextLine());

        // Hardcoding sample data for structural demo as logic is complex for console input
        String[] itEmps = {"Alice", "Bob"};
        comp.createDepartment("IT", itEmps);

        String[] hrEmps = {"Charlie"};
        comp.createDepartment("HR", hrEmps);

        System.out.println("\n--- Company Structure (Composition) ---");
        comp.showCompany();

        System.out.println("\nNote: When 'comp' object is destroyed, IT and HR departments are also destroyed.");
        sc.close();
    }
}