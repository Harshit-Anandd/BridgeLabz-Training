//Program to calculate the maximum number of handshakes possible in a group of students

import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter number of students
        System.out.println("Enter number of students : ");

        //Read number of students
        int numberOfStudents = sc.nextInt();

        //Calculate handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        //Display output
        System.out.println("The maximum number of handshakes is " + handshakes);

        //Close Scanner Stream
        sc.close();
    }
}