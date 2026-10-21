// GFG Problem Link: https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

import java.util.Arrays;

public class ZeroByOneKnapsackProblem {
    public int knapsack(int W, int value[], int weight[]) {
        // code here
        // get the length 
        int ind = value.length;
        
        // create the dp array 
        int[][] dp = new int[ind][W+1];
        // fill the rows with -1;
        for(int[] row : dp){
        
            Arrays.fill(row, -1);
        }
        
        return f(ind-1, W, value, weight, dp);
        
    }
    
    
    public int f(int ind, int W, int[] value, int[] weight, int[][] dp){
        
        // base case : if first is only remain option so check if it fits then add into knasack else return 0
        if(ind==0){
            if(weight[ind]<=W){
                return value[0];
            }
            
            return 0;
        }
        
        // if dp[ind][W] already calculated use it 
        if(dp[ind][W] != -1){
            return dp[ind][W];
        }
        
        
        // now explore possibkle solution whether take or  nnottake 
        int nottake = 0 + f(ind-1, W, value, weight, dp);  // not taking so no change just explore further solution simple
        
        // initially take is minint assuming 
        int take = Integer.MIN_VALUE;
        
        // now if fits take 
        if(weight[ind] <= W){
            take = value[ind] + f(ind-1, W- weight[ind], value, weight, dp);
        }
        
        // get the dp 
        dp[ind][W] = Math.max(take, nottake);
        
        return dp[ind][W];
    }
}
