// Solution for LeetCode #76

import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        
        // Frequency map for characters in t
        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }
        
        // Number of unique characters in t that need to be matched
        int required = tFreq.size();
        
        // Pointers for sliding window
        int left = 0, right = 0;
        int formed = 0; // Number of unique characters formed
        
        // Map for frequencies in current window
        Map<Character, Integer> windowFreq = new HashMap<>();
        
        // Answer: {window length, left index, right index}
        int[] answer = {-1, 0, 0};
        
        while (right < s.length()) {
            // Add character at right pointer to window
            char c = s.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);
            
            // Check if this character completes requirement
            if (tFreq.containsKey(c) && windowFreq.get(c).intValue() == tFreq.get(c).intValue()) {
                formed++;
            }
            
            // Try to contract window while it's valid
            while (left <= right && formed == required) {
                c = s.charAt(left);
                
                // Save smallest window so far
                if (answer[0] == -1 || right - left + 1 < answer[0]) {
                    answer[0] = right - left + 1;
                    answer[1] = left;
                    answer[2] = right;
                }
                
                // Remove character from window
                windowFreq.put(c, windowFreq.get(c) - 1);
                if (tFreq.containsKey(c) && windowFreq.get(c).intValue() < tFreq.get(c).intValue()) {
                    formed--;
                }
                
                // Move left pointer
                left++;
            }
            
            // Expand window
            right++;
        }
        
        return answer[0] == -1 ? "" : s.substring(answer[1], answer[2] + 1);
    }
}