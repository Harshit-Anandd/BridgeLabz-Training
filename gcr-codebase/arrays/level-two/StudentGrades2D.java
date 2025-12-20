//Create class StudentGrades2D that uses a 2D array to store marks of students in three subjects: Physics, Chemistry, and Maths.

import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");

        // Validate input is an integer
        while (!sc.hasNextInt()) {
            System.err.println("Invalid input. Please enter a valid integer.");
            sc.next();
        }
        int numStudents = sc.nextInt();

        // Validate number of students
        if (numStudents <= 0) {
            System.err.println("Error: Number of students must be positive.");
            System.exit(0);
        }

        // Create a 2D array to store marks: [Student][Subject]
        // Subjects: 0 = Physics, 1 = Chemistry, 2 = Maths
        double[][] marks = new double[numStudents][3];
        
        // Create arrays to store percentages and grades
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Loop to take input for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            
            // Input marks for Physics
            System.out.print("Enter marks for Physics: ");

            // Validate input is a number
            while (!sc.hasNextDouble()) {
                System.err.println("Invalid input. Enter a number.");
                sc.next();
            }
            double physics = sc.nextDouble();

            // Input marks for Chemistry
            System.out.print("Enter marks for Chemistry: ");

            // Validate input is a number
            while (!sc.hasNextDouble()) {
                System.err.println("Invalid input. Enter a number.");
                sc.next();
            }
            double chemistry = sc.nextDouble();

            // Input marks for Maths
            System.out.print("Enter marks for Maths: ");

            // Validate input is a number
            while (!sc.hasNextDouble()) {
                System.err.println("Invalid input. Enter a number.");
                sc.next();
            }
            double maths = sc.nextDouble();

            // Check if any mark is negative or exceeds 100
            if (physics < 0 || chemistry < 0 || maths < 0 || physics > 100 || chemistry > 100 || maths > 100) {
                System.err.println("Error: Please enter valid marks (between 0 and 100).");
                i--; // Decrement index to repeat the loop for the same student
                continue;
            }

            // Store marks in the 2D array
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            // Calculate Percentage
            // Total marks = 300 (assuming 100 per subject)
            // Percentage = (Sum of marks / 300) * 100 OR (Average of marks)
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            // Calculate Grade based on Percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display the results
        System.out.println("\n--- Student Grade Report ---");
        System.out.println("Std\tPhysics\tChem\tMaths\tPerc(%)\tGrade");
        System.out.println("-----------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%.1f\t%.1f\t%.1f\t%.2f\t%s%n", 
                (i + 1), 
                marks[i][0], 
                marks[i][1], 
                marks[i][2], 
                percentages[i], 
                grades[i]
            );
        }

        // Close the Scanner Object
        sc.close();
    }
}