
package com.csvfilehandling;
import java.io.*;
public class WriteCsvService {
    public void writeCsv(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("ID,Name,Department,Salary\n");
            writer.write("201,Alex,IT,72000\n");
            writer.write("202,Olivia,HR,54000\n");
            writer.write("203,Liam,Finance,63000\n");
            writer.write("204,Sophia,Marketing,58000\n");
            writer.write("205,Noah,IT,69000\n");
        } catch (Exception e) { e.printStackTrace(); }
    }
}
