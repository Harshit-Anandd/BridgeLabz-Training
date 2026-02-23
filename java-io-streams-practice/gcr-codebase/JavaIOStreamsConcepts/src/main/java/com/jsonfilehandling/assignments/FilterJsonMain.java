
package com.jsonfilehandling.assignments;
import java.util.Scanner;
public class FilterJsonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilterJsonService service = new FilterJsonService();
        System.out.println("Enter the file path of the required JSON file: ");
        service.filter(sc.nextLine());
        sc.close();
    }
}
