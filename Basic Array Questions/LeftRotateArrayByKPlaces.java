// GFG Porblem Link: https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

public class LeftRotateArrayByKPlaces {
    public void rotateArr(int nums[], int d) {
        // code here
        // We will folllow 3 step strategies 
        // 1st step: reverse left part array
        // 2nd step: reverse right part of array 
        // 3rd step: reverse whole array
        
        // get the length (n)
        int n = nums.length;
        
        // base case 
        if(n==0){
            return;
        }
        
        // Actual D which work for any number of d 
        d = d%n;  
        
        
        // rotate left part 
        reverse(nums, 0, d-1); // left part reversing 
        reverse(nums, d, n-1); // right part reversing 
        reverse(nums, 0, n-1); // whole part reversing
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
