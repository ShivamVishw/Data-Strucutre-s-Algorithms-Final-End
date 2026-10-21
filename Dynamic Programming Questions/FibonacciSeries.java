// CodeChef Problem Link: https://www.codechef.com/practice/course/dynamic-programming/INTDP01/problems/DPFIBONACCI?tab=statement

import java.util.Arrays;
import java.util.Scanner;


public class FibonacciSeries {
    static long fib(int n, long [] dp) {
        //Write your code here
        
        // base case 
        if(n<=1){
            return 0;
        }
        
        
        // If already calculated, return stored value
        if(dp[n]!= -1){
            return dp[n];
        }
        
        // Calculate and store the result
        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        
        return dp[n];
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long dp[] = new long[n+1];
        Arrays.fill(dp, -1);  // initially asigning -1 as default value
        System.out.println(fib(n, dp));
        sc.close();
    }
}
