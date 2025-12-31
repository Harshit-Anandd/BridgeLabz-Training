package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;
public class University {
    private String name;
    private List<UniversityDepartment> departments; // Composition
    private List<Faculty> faculties;          // Aggregation

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: Dept created inside
    public void addDepartment(String deptName) {
        this.departments.add(new UniversityDepartment(deptName));
    }

    // Aggregation: Faculty added from outside
    public void addFaculty(Faculty f) {
        this.faculties.add(f);
    }

    public void showDetails() {
        System.out.println("University: " + name);
        System.out.print("Departments (Composition): ");
        for(UniversityDepartment d : departments) System.out.print(d.getName() + " ");
        System.out.print("\nFaculty (Aggregation): ");
        for(Faculty f : faculties) System.out.print(f.getName() + " ");
        System.out.println();
    }
}