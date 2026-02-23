package com.jsonfilehandling.ipl;

import java.io.*;
public class CsvHandler {
    public void process(String input, String output){
        try(BufferedReader br=new BufferedReader(new FileReader(input));
            BufferedWriter bw=new BufferedWriter(new FileWriter(output))){
            String header = br.readLine();
            bw.write(header); bw.newLine();
            String line;
            while((line=br.readLine())!=null){
                String[] d=line.split(",");
                d[1]=CensorUtil.maskTeam(d[1]);
                d[2]=CensorUtil.maskTeam(d[2]);
                d[6]="REDACTED";
                bw.write(String.join(",", d));
                bw.newLine();
            }
        }catch(Exception e){ e.printStackTrace(); }
    }
}