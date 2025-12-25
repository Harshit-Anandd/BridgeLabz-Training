// Create class NumberFormatDemo that generates a NumberFormatException and then handles it using the try-catch block

import java.util.Scanner;
public class NumberFormatDemo {

    public void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
			// Catching the NumberFormatException
            System.out.println("Caught NumberFormatException: Input is not a valid integer.");
        } catch (RuntimeException e) {
			// Catching the generic RuntimeException
            System.out.println("Caught RuntimeException.");
        }
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter a non-number string: ");
        String text = sc.next();
		
		// Create the object and call the method
        NumberFormatDemo demo = new NumberFormatDemo();
        demo.handleException(text);
		
		// Close the scanner stream
        sc.close();
    }
}