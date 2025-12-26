// Solution for LeetCode #242

class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Frequency array for 26 lowercase letters
        int[] frequency = new int[26];
        
        // Count frequency of characters in string s
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        
        // Decrement frequency for characters in string t
        for (int i = 0; i < t.length(); i++) {
            frequency[t.charAt(i) - 'a']--;
            
            // If frequency becomes negative, not an anagram
            if (frequency[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        
        // All frequencies should be 0 if they are anagrams
        return true;
    }
}