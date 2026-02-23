
package com.csvfilehandling;
import java.io.*;
import java.util.*;
public class MergeCsvService {
    public void merge(String f1, String f2, String out) {
        Map<String,String[]> map = new HashMap<>();
        try (BufferedReader br1 = new BufferedReader(new FileReader(f1));
             BufferedReader br2 = new BufferedReader(new FileReader(f2))) {

            br1.readLine();
            String line;
            while((line=br1.readLine())!=null){
                String[] d=line.split(",");
                map.put(d[0], d);
            }

            br2.readLine();
            List<String> output=new ArrayList<>();
            output.add("ID,Name,Age,Marks,Grade");
            while((line=br2.readLine())!=null){
                String[] d=line.split(",");
                String[] s1=map.get(d[0]);
                output.add(s1[0]+","+s1[1]+","+s1[2]+","+d[1]+","+d[2]);
            }

            try(BufferedWriter bw=new BufferedWriter(new FileWriter(out))){
                for(String o:output){ bw.write(o); bw.newLine(); }
            }

        } catch(Exception e){ e.printStackTrace(); }
    }
}
