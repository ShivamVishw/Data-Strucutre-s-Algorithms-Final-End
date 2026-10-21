// LeetCode Problem Link: https://leetcode.com/problems/house-robber/description/
// TUF Problem Link: https://takeuforward.org/practice/dsa/house-robber
// GFG Problem Link: https://www.geeksforgeeks.org/problems/maximum-money2855/1

import java.util.Arrays;

public class HouseRobber {
    public int f(int ind, int[] nums, int[] dp){

        // base case 1 
        if(ind==0){
            return nums[0];
        }

        // base case 2 as no negetive possible 
        if(ind<0){
            return 0;
        }

        // if already calculated 
        if(dp[ind]!= -1){
            return dp[ind];
        }

        // if picking current element 
        int pick = nums[ind] + f(ind-2, nums, dp);

        // if not picking current element 
        int notPick = 0 + f(ind-1, nums, dp);

        dp[ind] = Math.max(pick , notPick);

        return dp[ind];

    }
    public int rob(int[] nums) {
        int ind = nums.length;
        int dp[] = new int[ind+1];
        Arrays.fill(dp, -1);
        return f(ind-1, nums, dp);
    }
}
