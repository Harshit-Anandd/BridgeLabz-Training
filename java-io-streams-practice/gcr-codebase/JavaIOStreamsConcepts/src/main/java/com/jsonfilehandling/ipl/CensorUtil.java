
package com.jsonfilehandling.ipl;
public class CensorUtil {
    public static String maskTeam(String team){
        if(team.contains(" ")) 
            return team.substring(0, team.indexOf(" ")) + " ***";
        return "***";
    }
}
