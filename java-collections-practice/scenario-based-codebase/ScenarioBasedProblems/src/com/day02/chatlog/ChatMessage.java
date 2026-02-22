package com.day02.chatlog;

public class ChatMessage{
    private String ts,user,msg;
    public ChatMessage(String t,String u,String m){
        ts=t;user=u;msg=m;
    }
    public String getUser(){return user;}
    public String getMessage(){return msg;}
    public String toString(){return "["+ts+"] "+user+": "+msg;}
}