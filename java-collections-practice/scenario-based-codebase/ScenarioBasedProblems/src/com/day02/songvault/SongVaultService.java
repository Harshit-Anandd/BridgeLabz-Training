package com.day02.songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SongVaultService{
    private List<Song> songs=new ArrayList<>();
    private Map<String,List<Song>> map=new HashMap<>();
    private Set<String> artists=new HashSet<>();

    private static final Pattern T=Pattern.compile("Title:\\s*(.*)");
    private static final Pattern A=Pattern.compile("Artist:\\s*(.*)");
    private static final Pattern D=Pattern.compile("Duration:\\s*(.*)");
    private static final Pattern G=Pattern.compile("Genre:\\s*(.*)");

    public void read(String path){
        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            String line,title="",artist="",dur="",genre="";
            while((line=br.readLine())!=null){
                Matcher m;
                if((m=T.matcher(line)).matches())title=m.group(1);
                if((m=A.matcher(line)).matches())artist=m.group(1);
                if((m=D.matcher(line)).matches())dur=m.group(1);
                if((m=G.matcher(line)).matches())genre=m.group(1);
            }
            Song s=new Song(title,artist,dur,genre);
            songs.add(s);
            map.computeIfAbsent(genre,k->new ArrayList<>()).add(s);
            artists.add(artist);
        }catch(IOException e){System.out.println("Read error");}
    }

    public void displayByGenre(){
        map.forEach((g,l)->{
            System.out.println("\nGenre:"+g);
            l.forEach(System.out::println);
        });
    }

    public void uniqueArtists(){artists.forEach(System.out::println);}

    public void sortByTitle(){
        songs.stream().sorted(Comparator.comparing(Song::getTitle))
                .forEach(System.out::println);
    }
}