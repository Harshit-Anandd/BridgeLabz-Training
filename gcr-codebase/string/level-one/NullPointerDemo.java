// Create class NullPointerDemo that generates a NullPointerException and then handles it using the try-catch block

public class NullPointerDemo {

    // Method to generate Exception
    public void generateException() {
        String text = null;
        // Accessing method on null object throws exception
        System.out.println(text.length());
    }

    // Method to handle Exception
    public void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
			// Catching the NullPointerException
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
		
		// Create the object and call the method
        NullPointerDemo demo = new NullPointerDemo();
		
		// Display the result
        System.out.println("--- Generating Exception (Commented out to proceed) ---");
        // demo.generateException(); 
        System.out.println("--- Handling Exception ---");
        demo.handleException();
    }
}