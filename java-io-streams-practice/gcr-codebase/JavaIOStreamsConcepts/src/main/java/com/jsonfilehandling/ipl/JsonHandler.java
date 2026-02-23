package com.jsonfilehandling.ipl;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;
public class JsonHandler {
    public void process(String input, String output){
        try{
            ObjectMapper mapper = new ObjectMapper();
            List<IplMatch> matches = mapper.readValue(new File(input),
                mapper.getTypeFactory().constructCollectionType(List.class, IplMatch.class));
            for(IplMatch m : matches){
                m.team1 = CensorUtil.maskTeam(m.team1);
                m.team2 = CensorUtil.maskTeam(m.team2);
                m.player_of_match = "REDACTED";
            }
            mapper.writeValue(new File(output), matches);
        }catch(Exception e){ e.printStackTrace(); }
    }
}