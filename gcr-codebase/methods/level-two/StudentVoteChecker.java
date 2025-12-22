// Create class StudentVoteChecker to check voting eligibility of students based on age

import java.util.Scanner;
public class StudentVoteChecker {

    // Method to check if a student is eligible to vote
    // Returns true if age is 18 or greater, otherwise false
    public boolean canStudentVote(int age) {
        
        // Validation for negative age
        if (age < 0) {
            return false;
        }
        
        // Check eligibility
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] studentAges = new int[10];
        
        // Create object to call the method
        StudentVoteChecker checker = new StudentVoteChecker();

        // Loop to take input and check eligibility for each student
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of Student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();

            // Call method to check voting status
            boolean canVote = checker.canStudentVote(studentAges[i]);

            // Display result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
        // Close the scanner stream
        sc.close();
    }
}