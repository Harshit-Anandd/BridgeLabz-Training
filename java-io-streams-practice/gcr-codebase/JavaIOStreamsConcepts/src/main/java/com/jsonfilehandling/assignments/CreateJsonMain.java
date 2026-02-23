package com.jsonfilehandling.assignments;
import java.util.Scanner;
public class CreateJsonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreateJsonService service = new CreateJsonService();
        System.out.println("Enter the file path of the required JSON file: ");
        service.create(sc.nextLine());
        sc.close();
    }
}