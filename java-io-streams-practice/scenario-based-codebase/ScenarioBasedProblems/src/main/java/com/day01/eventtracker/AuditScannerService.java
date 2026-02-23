package com.day01.eventtracker;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.*;
public class AuditScannerService {
    public void scan(Class<?> clazz,String output){
        List<Map<String,Object>> logs=new ArrayList<>();
        for(Method m:clazz.getDeclaredMethods()){
            if(m.isAnnotationPresent(AuditTrail.class)){
                AuditTrail a=m.getAnnotation(AuditTrail.class);
                Map<String,Object> log=new HashMap<>();
                log.put("action",a.action());
                log.put("method",m.getName());
                log.put("timestamp",LocalDateTime.now().toString());
                logs.add(log);
            }
        }
        try{ new ObjectMapper().writeValue(new File(output),logs); }
        catch(Exception e){e.printStackTrace();}
    }
}
