// TUF Problem Link: https://takeuforward.org/practice/dsa/palindrome-number
// LeetCode Problem Link: https://leetcode.com/problems/palindrome-number/description/ 


public class CheckPalindromeNumber {
    public boolean isPalindrome(int n) {
        // base case
        if(n==0){
            return true;
        }
        int temp = n;
        int reversed =0;
        while(n>0){
            int rem = n%10;
            reversed = reversed*10+rem;
            n= n/10;
        }

        return reversed==temp;
    }
}
