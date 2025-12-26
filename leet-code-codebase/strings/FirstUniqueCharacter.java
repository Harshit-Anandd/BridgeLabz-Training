// Solution for LeetCode #387

import java.util.HashMap;
class Solution {
    public int firstUniqChar(String s) {
        // HashMap to store character frequency
        HashMap<Character, Integer> frequency = new HashMap<>();
        
        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        
        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // No unique character found
        return -1;
    }
}