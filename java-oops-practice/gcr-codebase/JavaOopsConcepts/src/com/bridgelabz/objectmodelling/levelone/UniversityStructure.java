package com.bridgelabz.objectmodelling.levelone;

public class UniversityStructure {
    public static void main(String[] args) {
        // Faculty exists independently
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Jones");

        University u = new University("Tech University");
        
        // Composition
        u.addDepartment("Computer Science");
        u.addDepartment("Physics");

        // Aggregation
        u.addFaculty(f1);
        u.addFaculty(f2);

        u.showDetails();
        
        System.out.println("\nProof of Independence (Aggregation):");
        System.out.println(f1.getName() + " still exists outside the university scope.");
    }
}