package com.day01.markmate;

import java.util.Scanner;
import java.util.List;
public class MarkMateMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CsvProcessorService csv=new CsvProcessorService();
        ReportCardService report=new ReportCardService();
        System.out.println("Enter the file path of the required input CSV file: ");
        List<Student> list=csv.process(sc.nextLine());
        System.out.println("Enter the file path of the required output CSV file: ");
        report.export(list,sc.nextLine());
        sc.close();
    }
}
