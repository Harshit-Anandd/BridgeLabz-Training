// Program to distribute pens equally
public class PenDistribution {
    public static void main(String[] args) {

        // Create total pens and students
        int totalPens = 14;
        int students = 3;

        // Calculate pens per student
        int pensPerStudent = totalPens / students;

        // Calculate remaining pens
        int remainingPens = totalPens % students;

        // Display output
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}