
package com.csvfilehandling;
import java.io.*;
public class FilterCsvService {
    public void filterStudents(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                if (Integer.parseInt(d[3]) > 80)
                    System.out.println(d[1] + " scored " + d[3]);
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
