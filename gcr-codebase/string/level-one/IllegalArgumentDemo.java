// Create class IllegalArgumentDemo that generates an IllegalArgumentException and then handles it using the try-catch block

import java.util.Scanner;
public class IllegalArgumentDemo {

    // Method to handle Exception
    public void handleException(String text) {
        try {
            // Start index > End index causes exception in logic
            // The standard substring throws IndexOutOfBounds, not IllegalArgument
            System.out.println(text.substring(5, 2)); 
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
			// Catching the IllegalArgumentException
            System.out.println("Caught Exception: " + e.getClass().getSimpleName());
        } catch (RuntimeException e) {
			// Catching the generic RuntimeException
            System.out.println("Caught Generic RuntimeException");
        }
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.next(); // Ensure input is long enough
		
		// Create the object and call the method
        IllegalArgumentDemo demo = new IllegalArgumentDemo();
        demo.handleException(text);
		
		// Close the scanner stream
        sc.close();
    }
}