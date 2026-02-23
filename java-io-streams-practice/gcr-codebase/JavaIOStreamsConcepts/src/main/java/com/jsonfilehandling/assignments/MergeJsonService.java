
package com.jsonfilehandling.assignments;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.*;
public class MergeJsonService {
    public void merge(String f1, String f2, String out){
        try{
            ObjectMapper mapper = new ObjectMapper();
            List list1 = mapper.readValue(new File(f1), List.class);
            List list2 = mapper.readValue(new File(f2), List.class);
            list1.addAll(list2);
            mapper.writeValue(new File(out), list1);
        }catch(Exception e){ e.printStackTrace(); }
    }
}
