// TUF Problem Link: https://takeuforward.org/practice/dsa/check-for-perfect-number
// LeetCode Problem Link: https://leetcode.com/problems/perfect-number/description/


public class CheckPerfactNumber {
    public boolean checkPerfectNumber(int n) {
        int sum=0;

        int i =1;
        while(i<n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }

        return sum == n;
    }
}
