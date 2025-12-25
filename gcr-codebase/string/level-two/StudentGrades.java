// Create class StudentGrades that generates random marks for students and calculates their grades

import java.util.Scanner;

public class StudentGrades {

    // Method to generate random marks for students
    public int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) marks[i][j] = (int)(Math.random()*50) + 50;
        }
        return marks;
    }

    // Method to calculate grade based on percentage
    public String calculateGrade(double percentage) {
        if(percentage >= 80) return "A";
        if(percentage >= 70) return "B";
        if(percentage >= 60) return "C";
        if(percentage >= 50) return "D";
        if(percentage >= 40) return "E";
        return "R";
    }

    public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		// Prompt the user to enter the values
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

		// Create the object and call the method
        StudentGrades grader = new StudentGrades();
        int[][] marks = grader.generateMarks(n);

		// Display the result
        System.out.println("Phy\tChem\tMath\tAvg\tGrade");
        for(int[] student : marks) {
            double total = student[0] + student[1] + student[2];
            double avg = total / 3.0;
            System.out.printf("%d\t%d\t%d\t%.2f\t%s\n", 
                student[0], student[1], student[2], avg, grader.calculateGrade(avg));
        }
		// Close the scanner stream
        sc.close();
    }
}