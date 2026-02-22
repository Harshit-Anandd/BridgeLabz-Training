package com.day02.chatlog;

import java.util.Set;
public class KeywordFilter implements MessageFilter<String>{
    private Set<String> blocked;
    public KeywordFilter(Set<String> b){blocked=b;}
    public boolean allow(String m){
        for(String w:blocked)
            if(m.toLowerCase().contains(w.toLowerCase()))return false;
        return true;
    }
}