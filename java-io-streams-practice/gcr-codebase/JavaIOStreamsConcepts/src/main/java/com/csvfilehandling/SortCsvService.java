
package com.csvfilehandling;
import java.io.*;
import java.util.*;
public class SortCsvService {
    public void sortBySalary(String filePath) {
        List<String[]> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) list.add(line.split(","));
        } catch (Exception e) { e.printStackTrace(); }
        list.sort((a,b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));
        for (int i=0; i<Math.min(5, list.size()); i++)
            System.out.println(list.get(i)[1] + " - " + list.get(i)[3]);
    }
}
