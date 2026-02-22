package com.annotations.suppresswarnings;
import java.util.ArrayList;
import java.util.List;

public class WarningLogic {
    
    @SuppressWarnings("unchecked")
    public void demonstrateSuppression() {
        List rawList = new ArrayList(); // Raw type usage
        
        rawList.add("String Data");
        rawList.add(100);
        rawList.add(45.5);
        
        System.out.println("Successfully added mixed elements to raw list without compilation warnings.");
        System.out.println("List content: " + rawList);
    }
}
