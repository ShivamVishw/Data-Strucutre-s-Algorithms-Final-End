// TUF Problem Link: https://takeuforward.org/practice/dsa/count-all-digits-of-a-number
// GFG Problem Link: https://www.geeksforgeeks.org/problems/count-total-digits-in-a-number/1


public class CountAllDigitsOfNumber {
    public int countDigit(int n) {
        // base case 
        if(n==0){
            return 1;
        }
        int temp=0;
        while(n>0){
            temp++;
            n = n/10;
        }

        return temp;
    }
}

