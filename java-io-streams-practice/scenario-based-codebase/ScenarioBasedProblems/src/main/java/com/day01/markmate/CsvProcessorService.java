package com.day01.markmate;

import java.io.*;
import java.util.*;
public class CsvProcessorService {
    public List<Student> process(String filePath){
        List<Student> students = new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            br.readLine();
            String line;
            while((line=br.readLine())!=null){
                String[] d=line.split(",");
                int total=Integer.parseInt(d[2])+Integer.parseInt(d[3])+Integer.parseInt(d[4]);
                double avg=total/3.0;
                Student s=new Student();
                s.id=Integer.parseInt(d[0]);
                s.name=d[1];
                s.total=total;
                s.average=avg;
                s.grade=avg>=85?"A":avg>=70?"B":"C";
                students.add(s);
            }
        }catch(Exception e){e.printStackTrace();}
        return students;
    }
}
