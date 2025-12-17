import java.util.Scanner;
public class SimpleInterest {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        int principal = sc.nextInt();  // principal amount
        System.out.println("Enter the time: ");
        int time = sc.nextInt();    // time in years
        System.out.println("Enter the rate: ");
        int rate = sc.nextInt();    // rate of interest
        System.out.println("Simple Intrest = " + ((principal*rate*time)/100));
        sc.close();
    }
}