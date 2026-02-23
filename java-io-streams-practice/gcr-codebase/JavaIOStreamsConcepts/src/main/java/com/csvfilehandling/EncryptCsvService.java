
package com.csvfilehandling;
import java.io.*;
import java.util.Base64;
public class EncryptCsvService {
    public void encrypt(String input, String output){
        try(BufferedReader br=new BufferedReader(new FileReader(input));
            BufferedWriter bw=new BufferedWriter(new FileWriter(output))){
            String line;
            while((line=br.readLine())!=null){
                bw.write(Base64.getEncoder().encodeToString(line.getBytes()));
                bw.newLine();
            }
        }catch(Exception e){ e.printStackTrace(); }
    }
}
