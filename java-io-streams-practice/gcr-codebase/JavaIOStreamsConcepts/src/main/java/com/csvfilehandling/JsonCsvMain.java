
package com.csvfilehandling;
import java.util.Scanner;
public class JsonCsvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JsonCsvService service = new JsonCsvService();
        System.out.println("Enter the file path of the required CSV and JSON file: ");
        service.csvToJson(sc.nextLine(), sc.nextLine());
        sc.close();
    }
}
