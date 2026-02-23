
package com.jsonfilehandling.assignments;
import java.util.Scanner;
public class ValidateJsonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidateJsonService service = new ValidateJsonService();
        System.out.println("Enter the file path of the required 2 JSON files: ");
        service.validate(sc.nextLine(), sc.nextLine());
        sc.close();
    }
}
