package com.day02.songvault;

public class Song extends Media{
    private String artist,duration;
    public Song(String t,String a,String d,String g){
        super(t,g);artist=a;duration=d;
    }
    public String getArtist(){return artist;}
    public String toString(){
        return title+" | "+artist+" | "+duration+" | "+genre;
    }
}