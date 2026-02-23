
package com.jsonfilehandling.assignments;
import com.fasterxml.jackson.databind.*;
import java.io.File;
public class ParseJsonService {
    public void parse(String filePath){
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(new File(filePath));
            for(JsonNode n : node){
                System.out.println("Name: " + n.get("name").asText());
            }
        }catch(Exception e){ e.printStackTrace(); }
    }
}
