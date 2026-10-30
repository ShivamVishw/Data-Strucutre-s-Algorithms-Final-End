// GFG Problem Link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
// LeetCode Problem Link: https://leetcode.com/problems/missing-number/

public class MissingNumberInArray {
    // 1th based indexing(problem says 1 to n)
    public int missingNumber1(int nums[]) {
        // // code here
        int xor1 = 0;
        int xor2 = 0;
        int n = nums.length+1;
        
        for(int i =0; i<nums.length; i++){
            xor1 = xor1^nums[i];
            xor2 = xor2^(i+1);
        }
        
        // last n is not included in xor 2 because of 0th based indexing 
        xor2 = xor2^n;
        
        return (xor1^xor2);
    }


    // 0th based indexing(problem says 0 to n)
    public int missingNumber2(int[] nums) {
    
        int xor1 = 0;
        int xor2 = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            xor1 = xor1^nums[i];
            xor2 = xor2^(i);
        }
        // this one not included in loops that's why need to do this as last number
        xor2 = xor2^n;
        
        return (xor1^xor2);
    }
}
