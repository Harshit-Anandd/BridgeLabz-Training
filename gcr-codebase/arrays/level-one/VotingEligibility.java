//Create class VotingEligibility that takes input of ages of 10 students and checks whether they are eligible to vote or not.

import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Define constant for number of students
        int numberOfStudents = 10;
        int votngAge = 18;
        
        // Array to store ages
        int[] ages = new int[numberOfStudents];
        
        // Loop to take input for 10 students
        System.out.println("Enter the ages of " + numberOfStudents + " students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            
            // Validate integer input
            while (!sc.hasNextInt()) {
                System.err.println("Invalid input. Enter an integer.");
                sc.next();
            }
            int age = sc.nextInt();
            
            // Validate non-negative age
            if (age < 0) {
                System.out.println("Age cannot be negative. Please enter again.");
                i--; // Decrement index to retry
                continue;
            }
            ages[i] = age;
        }
        
        // Check eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= votngAge) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }

        // Close the scanner stream
        sc.close();
    }
}