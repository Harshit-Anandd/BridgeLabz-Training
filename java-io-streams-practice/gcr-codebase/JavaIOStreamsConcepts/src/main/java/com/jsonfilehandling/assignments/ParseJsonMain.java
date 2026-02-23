
package com.jsonfilehandling.assignments;
import java.util.Scanner;
public class ParseJsonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParseJsonService service = new ParseJsonService();
        System.out.println("Enter the file path of the required JSON file: ");
        service.parse(sc.nextLine());
        sc.close();
    }
}
