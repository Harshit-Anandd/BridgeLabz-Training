// Solution for LeetCode #424

class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26]; // Frequency of characters in current window
        int maxCount = 0; // Maximum frequency of a single character in window
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            // Add current character to window
            char currentChar = s.charAt(right);
            charCount[currentChar - 'A']++;
            
            // Update max frequency in current window
            maxCount = Math.max(maxCount, charCount[currentChar - 'A']);
            
            // Calculate window length
            int windowLength = right - left + 1;
            
            // If replacements needed exceed k, shrink window from left
            if (windowLength - maxCount > k) {
                char leftChar = s.charAt(left);
                charCount[leftChar - 'A']--;
                left++;
                windowLength--; // Window length decreased after left pointer move
            }
            
            // Update max length
            maxLength = Math.max(maxLength, windowLength);
        }
        
        return maxLength;
    }
}