package com.day02.songvault;

public abstract class Media{
    protected String title,genre;
    public Media(String t,String g){title=t;genre=g;}
    public String getTitle(){return title;}
    public String getGenre(){return genre;}
}