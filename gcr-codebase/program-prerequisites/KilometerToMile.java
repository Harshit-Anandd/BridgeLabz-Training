import java.util.Scanner;
public class KilometerToMile {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance in Kilometres : ");
        int distance = sc.nextInt();
        System.out.println("Distance in Miles : "+ distance * 0.621371);
        sc.close();
    }
}