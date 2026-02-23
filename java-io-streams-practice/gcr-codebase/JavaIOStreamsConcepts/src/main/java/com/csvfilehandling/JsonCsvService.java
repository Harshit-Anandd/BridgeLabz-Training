
package com.csvfilehandling;
import java.io.*;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonCsvService {
    public void csvToJson(String csv, String jsonOut){
        try(BufferedReader br=new BufferedReader(new FileReader(csv))){
            String header=br.readLine();
            String[] keys=header.split(",");
            List<Map<String,String>> list=new ArrayList<>();
            String line;
            while((line=br.readLine())!=null){
                String[] values=line.split(",");
                Map<String,String> map=new HashMap<>();
                for(int i=0;i<keys.length;i++) map.put(keys[i],values[i]);
                list.add(map);
            }
            new ObjectMapper().writeValue(new File(jsonOut), list);
        }catch(Exception e){ e.printStackTrace(); }
    }
}
