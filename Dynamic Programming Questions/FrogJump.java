// GFG Problem Link: https://www.geeksforgeeks.org/problems/geek-jump/1
// LeetCode Problem Link(Try Differ somewhere): https://leetcode.com/problems/frog-jump/description/

import java.util.Arrays;

public class FrogJump {
    int minCost(int[] height) {
        // code here
        int n = height.length;
        
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        
        return f(n-1, height, dp);
        
    }
    
    int f(int ind , int [] heights, int dp[]){
        // base case 
        if(ind ==0 ){
            return 0;
        }
        
        
        // check if already calculated
        if(dp[ind] != -1){
            return dp[ind];
        }
        
        
        // now calculate left and right and store it 
        int left = f(ind -1 , heights, dp) + Math.abs(heights[ind] - heights[ind-1]);
        
        // now calculate right and before moving see right will not always calculate or need to calulate because if ind is at 1 no need to calculate right so initially we cwill asign max int and later if ind > 1 then calculate right
        int right = Integer.MAX_VALUE;
        
        if(ind>1){
            right = f(ind-2, heights, dp) + Math.abs(heights[ind] - heights[ind-2]);
        }
        
        
        
        // final result 
        dp[ind]  = Math.min(left , right);
        
        return dp[ind];
    }
}
