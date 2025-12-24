// Create class ArrayIndexDemo that generates an ArrayIndexOutOfBoundsException and then handles it using the try-catch block

import java.util.Scanner;
public class ArrayIndexDemo {
	
    public void handleException(String[] names) {
		
		// Generating the Exception and then handling it
        try {
            // Accessing index beyond length
            System.out.println(names[names.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
			// Catching the ArrayIndexOutOfBoundsException
            System.out.println("Caught ArrayIndexOutOfBoundsException.");
        } catch (RuntimeException e) {
			// Catching the generic RuntimeException
            System.out.println("Caught RuntimeException.");
        }
		
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];
		
		// Input loop
        for(int i=0; i<size; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.next();
        }
		
		// Create the object and call the method
        ArrayIndexDemo demo = new ArrayIndexDemo();
        demo.handleException(names);
		
		// Close the scanner stream
        sc.close();
    }
}