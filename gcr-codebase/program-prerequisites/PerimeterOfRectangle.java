import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        System.out.println("Perimeter of Rectangle = " + (2 * (length + width)));
        sc.close();
    }
}