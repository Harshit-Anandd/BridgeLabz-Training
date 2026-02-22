package com.annotations.jsonfield;
import java.util.Scanner;

public class JsonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JsonSerializerLogic logic = new JsonSerializerLogic();

        while (true) {
            System.out.println("\n--- @JsonField Serialization Menu ---");
            System.out.println("1. Create User and Convert to JSON");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 2) break;
            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                
                JsonUser user = new JsonUser(name, age);
                System.out.println("JSON Output:\n" + logic.convertToJson(user));
            }
        }
        sc.close();
    }
}
