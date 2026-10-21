// TUF Problem Link: https://takeuforward.org/practice/dsa/factorial-of-a-given-number-i
// LeetCode Problem Link: https://www.geeksforgeeks.org/problems/factorial5739/1


public class FactorialOfGivenNumber {
    public int factorial(int n) {
        // we will be using recursion here.
        // base case 
        if(n==0 || n==1){
            return 1;
        }
        
        return n*factorial(n-1);
    }
}
