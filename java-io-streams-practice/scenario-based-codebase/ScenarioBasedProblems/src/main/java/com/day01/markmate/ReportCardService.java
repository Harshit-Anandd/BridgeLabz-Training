package com.day01.markmate;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;
public class ReportCardService {
    public void export(List<Student> students,String output){
        try{ new ObjectMapper().writeValue(new File(output),students); }
        catch(Exception e){e.printStackTrace();}
    }
}
