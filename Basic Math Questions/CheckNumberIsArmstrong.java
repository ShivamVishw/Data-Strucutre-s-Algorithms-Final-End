// TUF Problem Link: https://takeuforward.org/practice/dsa/check-if-the-number-if-armstrong
// LeetCode Problem Link: https://leetcode.com/problems/armstrong-number/description/


public class CheckNumberIsArmstrong {
    public boolean isArmstrong(int n) {

        // get the count of integer in this number
        int temp =n;
        int sum =0;
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }

        // check armstrong number now 
        n= temp;
        while(n>0){
            int rem = n%10;
            sum += (int) Math.pow(rem, count);
            n=n/10;
        }

        return temp == sum;

    }
}
