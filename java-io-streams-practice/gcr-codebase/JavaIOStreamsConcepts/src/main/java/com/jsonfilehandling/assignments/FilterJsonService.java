
package com.jsonfilehandling.assignments;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.*;
public class FilterJsonService {
    public void filter(String filePath){
        try{
            List<Map> list = new ObjectMapper().readValue(new File(filePath), List.class);
            for(Map m : list){
                if((Integer)m.get("age") > 25)
                    System.out.println(m.get("name") + " is above 25");
            }
        }catch(Exception e){ e.printStackTrace(); }
    }
}
