// LeetCode Problem Link: https://leetcode.com/problems/max-consecutive-ones/

public class MaximumConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count =0;

        for(int num : nums){
            if(num ==1){
                count ++;
            }else{
                max = count>max? count : max;  // compare whether consecutive got till now is better than previous consecutive once
                count =0;  // reset again 0 for next consecutiveness of once 
            }
            
        }
        // if last element was 1 then it would not go through else .... so there might be chance last consecutive was max consecutive once so we need to check and update max
        max = count>max? count : max;

        return max;
    }
}
