// TUF Problem Link: https://takeuforward.org/practice/dsa/count-of-prime-numbers-till-n
// LeetCode Problem Link: https://leetcode.com/problems/count-primes/description/


public class CountOfPrimeNumberTillN {
    public int primeUptoN(int n) {
        
        int count =0;

        for(int num = 2; num<=n; num++){

            // intially this saying current number is true or prime            
            boolean isprime = true;

            // now we need to check whether current number is prime or not and we dont need to check till n if we can check upto n/i sqrtofn

            for(int i=2; i<= num/i; i++){
                if(num%i==0){
                    isprime= false;
                    break;
                }
            }

            if(isprime){
                count++;
            }

        }

        return count;
    }
}
