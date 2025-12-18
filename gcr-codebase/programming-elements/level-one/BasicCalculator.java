//Ctreate a BasicCalculator class to perform basic arithmetic operations

import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter two numbers
        System.out.println("Enter two numbers : ");

        //Read numbers
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        //Perform operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        //Display result
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        //Close the Scanner Stream
        sc.close();
    }
}