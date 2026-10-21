// LeetCode Problem Link: https://leetcode.com/problems/house-robber-ii/description/

import java.util.Arrays;

public class HouseRobber2 {
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
        // base case
        if(nums.length == 1){
            return nums[0];
        }

        int [] excludeFirstArray = Arrays.copyOfRange(nums, 1, nums.length);
        int [] excludeLastArray = Arrays.copyOfRange(nums, 0, nums.length-1); 
        int ind1 = excludeFirstArray.length;
        int ind2 = excludeLastArray.length;
        int dp1[] = new int[ind1+1];
        int dp2[] = new int[ind2+1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        return Math.max(f(ind1-1, excludeFirstArray, dp1), f(ind2-1, excludeLastArray, dp2));
    }
}
