package com.day02.chatlog;

import java.util.*;
public class ChatLogParserMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ChatLogParserService s=new ChatLogParserService();
        Set<String> blocked=new HashSet<>(Arrays.asList("lol","brb"));
        MessageFilter<String> f=new KeywordFilter(blocked);
        boolean run=true;
        while(run){
            System.out.println("\n1.Parse 2.Display 3.Exit");
            int ch=sc.nextInt();sc.nextLine();
            switch(ch){
                case 1:System.out.print("File: ");
                       s.parse(sc.nextLine(),f);break;
                case 2:s.display();break;
                case 3:run=false;
            }
        }sc.close();
    }
}