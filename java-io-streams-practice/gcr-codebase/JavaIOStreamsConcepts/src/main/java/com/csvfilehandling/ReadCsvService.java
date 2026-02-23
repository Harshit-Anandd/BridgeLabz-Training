
package com.csvfilehandling;
import java.io.*;
public class ReadCsvService {
    public void readCsv(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] c = line.split(",");
                System.out.println("ID: " + c[0] + ", Name: " + c[1] + ", Age: " + c[2] + ", Marks: " + c[3]);
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
