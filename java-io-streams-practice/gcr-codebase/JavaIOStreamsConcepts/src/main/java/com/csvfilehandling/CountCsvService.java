
package com.csvfilehandling;
import java.io.*;
public class CountCsvService {
    public void countRows(String filePath) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            while (br.readLine() != null) count++;
            System.out.println("Total Records: " + count);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
