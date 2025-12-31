package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;
public class Company {
    private String companyName;
    private List<Department> departments; // Composition

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add department (Managed internally for Composition)
    public void createDepartment(String deptName, String[] empNames) {
        Department d = new Department(deptName);
        for(String emp : empNames) {
            d.addEmployee(emp);
        }
        this.departments.add(d);
    }

    public void showCompany() {
        System.out.println("Company: " + companyName);
        for(Department d : departments) d.showDetails();
    }
    
    // In Java, Garbage Collection handles deletion, but logically, 
    // since departments are created inside Company and stored in a private list,
    // they become inaccessible (deleted) when the Company object is lost.
}