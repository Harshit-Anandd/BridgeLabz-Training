
package com.jsonfilehandling.assignments;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
public class CreateJsonService {
    public void create(String filePath) {
        try {
            Map<String,Object> map = new HashMap<>();
            map.put("name","Sample");
            map.put("age",28);
            map.put("email","sample@example.com");
            new ObjectMapper().writeValue(new File(filePath), map);
        } catch(Exception e){ e.printStackTrace(); }
    }
}
