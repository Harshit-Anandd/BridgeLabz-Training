// Create class IndexOutOfBoundsDemo that generates a StringIndexOutOfBoundsException and then handles it using the try-catch block

import java.util.Scanner;
public class IndexOutOfBoundsDemo {

    // Method to handle Exception
    public void handleException(String text) {
        try {
            // Accessing index equal to length (valid indexes are 0 to length-1)
            char c = text.charAt(text.length()); 
        } catch (StringIndexOutOfBoundsException e) {
			// // Catching the StringIndexOutOfBoundsException
            System.out.println("Caught Exception: String index out of range.");
        }
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter text: ");
        String text = sc.next();
		
		// Create the object and call the method
        IndexOutOfBoundsDemo demo = new IndexOutOfBoundsDemo();
        demo.handleException(text);
		
		// Close the scanner stream
        sc.close();
    }
}