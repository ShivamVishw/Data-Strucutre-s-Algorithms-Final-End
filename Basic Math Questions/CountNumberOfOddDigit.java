// Problem Link: https://takeuforward.org/practice/dsa/count-number-of-odd-digits-in-a-number


public class CountNumberOfOddDigit {
    public int countOddDigit(int n) {
        if(n==0){
            return 0;
        }

        int count =0; 

        while(n>0){
            int rem = n%10;
            if(rem%2!=0){
                count++;
            }
            n= n/10;
        }

        return count;
    }
}
