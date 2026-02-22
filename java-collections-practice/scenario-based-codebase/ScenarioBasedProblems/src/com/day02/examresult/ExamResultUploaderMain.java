package com.day02.examresult;

import java.util.Scanner;
public class ExamResultUploaderMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ExamResultService<String> s=new ExamResultService<>();
        boolean run=true;
        while(run){
            System.out.println("\n1.Process 2.Top 3.Exit");
            int ch=sc.nextInt();sc.nextLine();
            switch(ch){
                case 1:System.out.print("File: ");
                       s.process(sc.nextLine());break;
                case 2:s.topScores();break;
                case 3:run=false;
            }
        }sc.close();
    }
}