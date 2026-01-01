// Solution for LeetCode #3

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap to store the last index of each character
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0; // Left pointer of sliding window
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If character is already in the window, move left pointer
            if (charIndexMap.containsKey(currentChar)) {
                // Move left pointer to the right of the previous occurrence
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }
            
            // Update character's last seen index
            charIndexMap.put(currentChar, right);
            
            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}