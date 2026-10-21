// TUF Problem Link: https://takeuforward.org/practice/dsa/return-the-largest-digit-in-a-number


public class LargestDigitInNumber {
    public int largestDigit(int n) {
        int result =0;

        while(n>0){
            int rem = n%10;
            if(rem>result){
                result = rem;
                n=n/10;
            }else{
                n= n/10;
            }
            
        }

        return result;
    }
}
