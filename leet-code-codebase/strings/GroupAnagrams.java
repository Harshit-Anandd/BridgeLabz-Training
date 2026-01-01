// Solution for LeetCode #49

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to group anagrams by their sorted version
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        
        for (String str : strs) {
            // Sort characters to create key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // Add to corresponding group
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }
        
        // Convert map values to list
        return new ArrayList<>(anagramMap.values());
    }
}