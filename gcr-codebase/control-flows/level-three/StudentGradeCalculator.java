//Create class StudentGradeCalculator that calculates the total marks, average percentage, grade, and remarks based on marks obtained in three subjects: Physics, Chemistry, and Maths.

import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        double physicsMarks = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistryMarks = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = sc.nextDouble();

        // Calculate total and percentage
        // Assuming max marks per subject is 100
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300.0) * 100;

        // Variables to store Grade and Remarks
        String grade;
        String remarks;

        // Determine Grade and Remarks based on the table in the image
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display the final output
        System.out.println("\n--- Results ---");
        System.out.printf("Total Marks: %.2f / 300\n", totalMarks);
        System.out.printf("Average Mark/Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close the scanner stream
        sc.close();
    }
}