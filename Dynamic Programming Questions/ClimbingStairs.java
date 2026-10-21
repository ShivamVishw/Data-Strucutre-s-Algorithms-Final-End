// LeetCode Problem Link: https://leetcode.com/problems/climbing-stairs/description/
// GFG Problem Link: https://www.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1



public class ClimbingStairs {
    // public int climbStairs(int n) {

    //     // create dp array
    //     int dp[] = new int[n+1];

    //     Arrays.fill(dp, -1);

    //     return solve(n, dp);
        
    // }

    // private int solve(int n, int[] dp){
    //     // base case 
    //     if(n<=2){
    //         return n;
    //     }

    //     // If already calculated then get dp[n]
    //     if(dp[n]!= -1){
    //         return dp[n];
    //     }

    //     // calculate and store remaining 
    //     dp[n] = solve(n-1, dp) + solve(n-2, dp);


    //     return dp[n];
    // }
    
    // Tabulation solution
    public int climbStairs(int n) {

        if(n==1 || n==2){
            return n;
        }

        int [] dp = new int[n+1];

        // 1. base case
        dp[1] = 1;
        dp[2] = 2;

        // 3rd step 
        for(int i =3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2]; // taking alue from base and goint to upward direction (bottom top tabulation approach)
        }

        return dp[n];
        
    }
}
