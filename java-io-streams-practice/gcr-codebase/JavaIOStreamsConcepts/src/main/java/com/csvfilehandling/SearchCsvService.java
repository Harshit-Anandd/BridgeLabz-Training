
package com.csvfilehandling;
import java.io.*;
public class SearchCsvService {
    public void searchEmployee(String filePath, String name) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                if (d[1].equalsIgnoreCase(name)) {
                    System.out.println("Department: " + d[2]);
                    System.out.println("Salary: " + d[3]);
                }
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
