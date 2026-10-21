// TUF Problem Link: https://takeuforward.org/practice/dsa/check-for-prime-number


public class CheckPrimeNumber {
    public boolean isPrime(int n) {

        // base case 1
        if(n<2){
            return false;
        }
        
        // base case 2
        if(n==2){
            return true;
        }
        // your code goes here
        int i = n-1;
        while(i>1){
            if(n%i==0){
                i--;
                return false;
            }
            i--;
        }

        return true;
    }
}
