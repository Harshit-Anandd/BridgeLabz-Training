package com.streams.consoleinput;
import java.io.*;

public class UserDataManager {
    public void saveUserDetails(BufferedReader br) {
        try {
            System.out.print("Enter Name: ");
            String name = br.readLine();
            System.out.print("Enter Age: ");
            String age = br.readLine();
            System.out.print("Enter Favorite Language: ");
            String lang = br.readLine();
            
            try (FileWriter fw = new FileWriter("user_details.txt", true)) {
                fw.write("Name: " + name + ", Age: " + age + ", Lang: " + lang + "\n");
                System.out.println("Data saved to user_details.txt successfully.");
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}