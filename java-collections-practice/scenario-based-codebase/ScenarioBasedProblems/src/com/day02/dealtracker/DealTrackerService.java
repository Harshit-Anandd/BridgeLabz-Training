package com.day02.dealtracker;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class DealTrackerService<T>{
    private Map<String,Deal> map=new HashMap<>();
    private Set<String> codes=new HashSet<>();
    private static final Pattern P=Pattern.compile("(\\d+)%");

    public void read(String path){
        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            String line,code="";LocalDate date=null;
            int disc=0,min=0;
            while((line=br.readLine())!=null){
                if(line.startsWith("DealCode:"))
                    code=line.split(":")[1].trim();
                else if(line.startsWith("ValidTill:"))
                    date=LocalDate.parse(line.split(":")[1].trim(),
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                else if(line.startsWith("Discount:")){
                    Matcher m=P.matcher(line);
                    if(m.find())disc=Integer.parseInt(m.group(1));
                }else if(line.startsWith("MinimumPurchase:"))
                    min=Integer.parseInt(line.split(":")[1].trim());
            }
            if(!codes.contains(code) && date!=null &&
               date.isAfter(LocalDate.now())){
                map.put(code,new Deal(code,date,disc,min));
                codes.add(code);
            }
        }catch(Exception e){System.out.println("Deal error");}
    }

    public void display(){
        map.values().stream()
           .sorted(Comparator.comparingInt(Deal::getDiscount).reversed())
           .forEach(System.out::println);
    }
}