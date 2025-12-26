// Solution for LeetCode #350

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // HashMap to store frequency of elements in first array
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count frequencies in nums1
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // List to store intersection elements
        List<Integer> resultList = new ArrayList<>();
        
        // Check elements in nums2 against frequency map
        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                resultList.add(num);
                // Decrease frequency count
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }
        
        // Convert list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}