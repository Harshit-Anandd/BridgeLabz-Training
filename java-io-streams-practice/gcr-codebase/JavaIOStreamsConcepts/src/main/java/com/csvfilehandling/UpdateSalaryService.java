
package com.csvfilehandling;
import java.io.*;
import java.util.*;
public class UpdateSalaryService {
    public void updateSalary(String inputPath, String outputPath) {
        List<String[]> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String line;
            while ((line = br.readLine()) != null) records.add(line.split(","));
        } catch (Exception e) { e.printStackTrace(); }
        for (int i = 1; i < records.size(); i++) {
            if (records.get(i)[2].equalsIgnoreCase("IT")) {
                int salary = Integer.parseInt(records.get(i)[3]);
                salary += salary * 0.10;
                records.get(i)[3] = String.valueOf(salary);
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            for (String[] row : records) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
