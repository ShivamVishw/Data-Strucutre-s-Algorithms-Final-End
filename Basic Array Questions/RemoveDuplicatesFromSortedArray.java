// LeetCode Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicate(int [] nums){
        // we are following 2 pointer approach where 1 pointer will be used for correect placing of next unique element and 2nd pointer will be used for getting next unique element form the array 
        // See first element will be always at correct position as problem saying it is already sorted that's why starting from 1st index (k is nothing but index)
        int k = 1;
        // 2nd pointer will be i for getting next uniqie element 
        for(int i =1; i< nums.length; i++){
            if(nums[i]>nums[i-1]){ // means next unique element found 
                nums[k] = nums[i];
                k++; // increment for inserting at next correct position
            }
        }

        return k;
    }
}
