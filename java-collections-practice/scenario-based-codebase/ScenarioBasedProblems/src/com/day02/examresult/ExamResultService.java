package com.day02.examresult;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultService<T>{
    private static final Pattern P=Pattern.compile("^\\d+,[A-Za-z ]+,[A-Za-z]+,\\d+$");
    private Map<String,List<Integer>> map=new HashMap<>();

    public void process(String path){
        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            String line;
            while((line=br.readLine())!=null){
                if(!P.matcher(line).matches())
                    throw new InvalidMarksException("Invalid:"+line);
                String[] p=line.split(",");
                map.computeIfAbsent(p[2].trim(),k->new ArrayList<>())
                   .add(Integer.parseInt(p[3].trim()));
            }
        }catch(Exception e){System.out.println(e.getMessage());}
    }

    public void topScores(){
        map.forEach((sub,l)->{
            PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
            pq.addAll(l);
            System.out.println(sub+" → Top:"+pq.peek());
        });
    }
}