
package com.csvfilehandling;
import java.io.*;
public class LargeFileService {
    public void process(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            int count=0, chunk=0;
            while(br.readLine()!=null){
                count++; chunk++;
                if(chunk==100){
                    System.out.println("Processed 100 records");
                    chunk=0;
                }
            }
            System.out.println("Total records processed: "+count);
        } catch(Exception e){ e.printStackTrace(); }
    }
}
