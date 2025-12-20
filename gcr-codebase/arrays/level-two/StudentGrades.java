//Create class StudentGrades that takes number of students and their marks in Physics, Chemistry and Maths as input

import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");

        // Validate input is an integer
        while (!sc.hasNextInt()) {
            System.err.println("Invalid input. Please enter a valid integer.");
            sc.next();
        }
        int numStudents = sc.nextInt();

        // Validate number of students is positive
        if (numStudents <= 0) {
            System.err.println("Error: Number of students must be positive.");
            System.exit(0);
        }

        // Create arrays to store marks, percentages, and grades
        double[] physics = new double[numStudents];
        double[] chemistry = new double[numStudents];
        double[] maths = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Loop to take input for marks of students
        for (int i = 0; i < numStudents; i++) {

            // Prompt for marks input
            System.out.println("\n--- Enter marks for Student " + (i + 1) + " ---");

            // Input Physics Marks
            System.out.print("Physics: ");

            // Validate input is a number
            while (!sc.hasNextDouble()) {
                System.err.println("Invalid input. Please enter a number.");
                sc.next();
            }
            double phy = sc.nextDouble();

            // Input Chemistry Marks
            System.out.print("Chemistry: ");

            // Validate input is a number
            while (!sc.hasNextDouble()) {
                System.err.println("Invalid input. Please enter a number.");
                sc.next();
            }
            double chem = sc.nextDouble();

            // Input Maths Marks
            System.out.print("Maths: ");

            // Validate input is a number
            while (!sc.hasNextDouble()) {
                System.err.println("Invalid input. Please enter a number.");
                sc.next();
            }
            double math = sc.nextDouble();

            // Check if any mark is negative or exceeds 100
            if (phy < 0 || chem < 0 || math < 0 || phy > 100 || chem > 100 || math > 100) {
                System.err.println("Error: Please enter valid marks (between 0 and 100).");
                i--; // Decrement index to repeat the loop for the same student
                continue;
            }

            // Store valid marks in arrays
            physics[i] = phy;
            chemistry[i] = chem;
            maths[i] = math;

            // Calculate Percentage
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // Calculate Grade based on guidelines
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
                physics[i], 
                chemistry[i], 
                maths[i], 
                percentages[i], 
                grades[i]
            );
        }

        // Close the scanner stream
        sc.close();
    }
}