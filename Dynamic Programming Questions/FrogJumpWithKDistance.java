// TUF Problem Link: https://takeuforward.org/practice/dsa/frog-jump-with-k-distances

import java.util.Arrays;

public class FrogJumpWithKDistance {
    public int frogJump(int[] heights, int k) {
        int n = heights.length;

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return frogjumps(n-1, heights, k, dp);
    }
    public int frogjumps(int ind, int[] heights, int k, int[] dp) {

        // base case 
        if(ind ==0){
            return 0;
        }

        //check if already calculated 
        if(dp[ind] != -1){
            return dp[ind];
        }

        // minimum steps tequired 
        int minStep = Integer.MAX_VALUE;

        // now geral formula to calculate possivle choises 

        for(int j = 1; j<=k; j++){
            if(ind-j>=0){
                int jump = frogjumps(ind-j,heights, k, dp) + Math.abs(heights[ind] - heights[ind-j]);

                minStep = Math.min(minStep, jump);
            }
        }


        dp[ind] = minStep;


        return dp[ind];
    }
}
