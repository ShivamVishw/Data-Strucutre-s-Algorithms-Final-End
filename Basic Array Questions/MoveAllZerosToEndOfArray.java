// GFG Problem Link: https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
// LeetCode Problem Link: https://leetcode.com/problems/move-zeroes/description/

public class MoveAllZerosToEndOfArray {

    public void pushZerosToEnd(int[] nums) {
        // code here
        // we are using 2 pointer approach 1 will be tracking correct position to place non zero element and another one will be used to get next non zero element
        // pointer 1
        int index =0;
        
        // pointer 2
        // place non zero to correct place (left most side while maintaining order)
        for(int i =0; i<nums.length; i++){
            if(nums[i] != 0){   // if it is non zero
                nums[index] = nums[i];  // place at correct position
                index++;
            }
        }
        
        // now place zero on remeaining part 
        if(index< nums.length){
            for(int i= index; i< nums.length; i++){
                nums[index] = 0;
                index ++; // increment to next index
            }
        }
        
    }
    
}