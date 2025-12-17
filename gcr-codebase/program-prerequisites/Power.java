import java.util.Scanner;
public class Power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number : ");
        int a = sc.nextInt();
        System.out.println("Enter the power : ");
        int b = sc.nextInt();
        int result = (int) Math.pow(a, b);
        System.out.println("The Result is"+result);
        sc.close();
    }
}