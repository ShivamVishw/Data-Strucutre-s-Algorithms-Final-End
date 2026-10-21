// TUF Problem Link: https://takeuforward.org/practice/dsa/gcd-of-two-numbers


public class GcdOfTwoNumber {
    public int GCD(int n1, int n2) {
        int largenum = n1>n2? n1 : n2;

        for(int i = largenum; i>=1; i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }

        return -1;
    }
}
