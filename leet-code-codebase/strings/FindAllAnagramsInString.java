// Solution for LeetCode #438

import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        if (s.length() < p.length()) {
            return result;
        }
        
        // Frequency arrays for pattern and current window
        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];
        
        // Count frequencies in pattern
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }
        
        // Initialize first window
        for (int i = 0; i < p.length(); i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }
        
        // Check first window
        if (Arrays.equals(pFreq, windowFreq)) {
            result.add(0);
        }
        
        // Slide window through the string
        for (int i = p.length(); i < s.length(); i++) {
            // Remove character leaving the window
            windowFreq[s.charAt(i - p.length()) - 'a']--;
            
            // Add character entering the window
            windowFreq[s.charAt(i) - 'a']++;
            
            // Check if current window is an anagram
            if (Arrays.equals(pFreq, windowFreq)) {
                result.add(i - p.length() + 1);
            }
        }
        
        return result;
    }
}