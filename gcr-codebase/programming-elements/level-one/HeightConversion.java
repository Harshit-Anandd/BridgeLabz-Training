import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter height in cm
        System.out.println("Enter your height in cm : ");

        // Read height in cm
        double heightCm = sc.nextDouble();

        // Convert to inches
        double inches = heightCm / 2.54;

        // Convert to feet
        double feet = inches / 12;

        // Display output
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);

        // Close Scanner Stream
        sc.close();
    }
}