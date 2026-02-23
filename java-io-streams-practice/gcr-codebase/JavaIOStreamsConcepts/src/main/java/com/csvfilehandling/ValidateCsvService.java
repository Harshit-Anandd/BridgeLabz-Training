
package com.csvfilehandling;
import java.io.*;
public class ValidateCsvService {
    public void validate(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                if (!d[3].matches("\\d+"))
                    System.out.println("Invalid salary row: " + line);
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
