package com.day02.medinventory;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class MedInventoryService{
    private static final Pattern DATE=Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
    private Map<String,List<Item>> map=new HashMap<>();
    private Set<Item> unique=new HashSet<>();

    public void readInventory(String path){
        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            String line;
            while((line=br.readLine())!=null){
                String[] p=line.split(",");
                if(p.length!=4)continue;
                if(!DATE.matcher(p[3].trim()).matches())continue;
                Item item=new Item(p[0].trim(),p[1].trim(),
                        Integer.parseInt(p[2].trim()),p[3].trim());
                if(unique.add(item)){
                    map.computeIfAbsent(p[1].trim(),k->new ArrayList<>()).add(item);
                }
                if(item.getQuantity()<5)
                    throw new LowSupplyException("Low supply: "+p[1]);
            }
        }catch(Exception e){System.out.println(e.getMessage());}
    }

    public void display(){
        map.forEach((k,v)->{
            System.out.println("\nCategory:"+k);
            v.forEach(System.out::println);
        });
    }
}