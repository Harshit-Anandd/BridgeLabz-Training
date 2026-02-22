package com.day02.chatlog;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParserService{
    private static final Pattern P=Pattern.compile("\\[(.*?)\\] (.*?): (.*)");
    private TreeMap<String,List<String>> map=new TreeMap<>();

    public void parse(String path,MessageFilter<String> f){
        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            String line;
            while((line=br.readLine())!=null){
                Matcher m=P.matcher(line);
                if(m.matches() && f.allow(m.group(3))){
                    map.computeIfAbsent(m.group(2),k->new ArrayList<>())
                       .add(m.group(3));
                }
            }
        }catch(IOException e){System.out.println("Read error");}
    }

    public void display(){
        map.forEach((u,l)->{
            System.out.println("\nUser:"+u);
            l.forEach(System.out::println);
        });
    }
}