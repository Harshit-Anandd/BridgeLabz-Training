package com.jsonfilehandling.ipl;

public class IplService {
    public void processJson(String input, String output){
        new JsonHandler().process(input, output);
    }
    public void processCsv(String input, String output){
        new CsvHandler().process(input, output);
    }
}
