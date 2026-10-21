// TUF Problem Link: https://takeuforward.org/practice/dsa/highest-occurring-element-in-an-array
// LeetCode Problem Link: https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/

import java.util.HashMap;
import java.util.Map;

public class HighestOccuringElementInArray {
    public int maxFrequency(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Assign the frequencies
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        // Get the highest occuring element 
        int highestFreq = 0;
        int result = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()> highestFreq || (entry.getValue()==highestFreq && entry.getKey()< result)){
                highestFreq= entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
}
