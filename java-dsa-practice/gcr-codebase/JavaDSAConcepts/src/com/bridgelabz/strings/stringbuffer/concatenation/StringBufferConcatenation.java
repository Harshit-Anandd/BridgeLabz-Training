package com.bridgelabz.strings.stringbuffer.concatenation;

public class StringBufferConcatenation {
    public static String concatenateArray(String[] words) {
        // 1. Create new StringBuffer
        StringBuffer sb = new StringBuffer();
        
        // 2. Iterate and append
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Java", " ", "Programming", " ", "Language"};
        System.out.println(concatenateArray(words));
    }
}