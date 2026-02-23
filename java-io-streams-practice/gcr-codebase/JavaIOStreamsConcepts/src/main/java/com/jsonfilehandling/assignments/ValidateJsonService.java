
package com.jsonfilehandling.assignments;
import com.fasterxml.jackson.databind.*;
import com.github.fge.jsonschema.main.*;
import java.io.File;
public class ValidateJsonService {
    public void validate(String schemaPath, String jsonPath){
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode schemaNode = mapper.readTree(new File(schemaPath));
            JsonNode dataNode = mapper.readTree(new File(jsonPath));
            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);
            if(schema.validate(dataNode).isSuccess())
                System.out.println("Valid JSON");
            else
                System.out.println("Invalid JSON");
        }catch(Exception e){ e.printStackTrace(); }
    }
}
