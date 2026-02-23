
package com.csvfilehandling;
import java.util.Scanner;
public class FilterCsvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilterCsvService service = new FilterCsvService();
        System.out.println("Enter the file path of the required CSV file: ");
        service.filterStudents(sc.nextLine());
        sc.close();
    }
}
