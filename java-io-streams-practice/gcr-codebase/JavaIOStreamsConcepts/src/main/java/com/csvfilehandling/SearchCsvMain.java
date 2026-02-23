
package com.csvfilehandling;
import java.util.Scanner;
public class SearchCsvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchCsvService service = new SearchCsvService();
        System.out.println("Enter the file path of the required CSV file: ");
        String file = sc.nextLine();
        System.out.println("Enter the name to search in the CSV file: ");
        String name = sc.nextLine();
        service.searchEmployee(file, name);
        sc.close();
    }
}
