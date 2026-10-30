// LeetCode Problem Link: https://leetcode.com/problems/rotate-array/

public class RightRotateArrayByKPlaces {
    public void rotateArr(int nums[], int d) {
        // code here
        // We will folllow 3 step strategies 
        // 1st step: reverse whole array
        // 2nd step: reverse left part array 
        // 3rd step: reverse right part of array
        
        // get the length (n)
        int n = nums.length;
        
        // base case 
        if(n==0){
            return;
        }
        
        // Actual D which work for any number of d 
        d = d%n;  
        
        
        // rotate left part 
        reverse(nums, 0, n-1); // whole part reversing
        reverse(nums, 0, d-1); // left part reversing 
        reverse(nums, d, n-1); // right part reversing 
        
    }
    
    void reverse(int nums[], int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
}
