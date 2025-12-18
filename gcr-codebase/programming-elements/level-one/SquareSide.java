//Program to calculate the side of a square from its perimeter

import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter perimeter of the square
        System.out.println("Enter perimeter of the square : ");

        //Read perimeter of the square
        double perimeter = sc.nextDouble();

        //Calculate side of the square
        double side = perimeter / 4;

        //Display output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        //Close Scanner Stream
        sc.close();
    }
}