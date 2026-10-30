// TUF Problem Link: https://takeuforward.org/practice/dsa/second-largest-element
// GFG Problem Link: https://www.geeksforgeeks.org/problems/second-largest3735/1

public class CheckSecondLargestElementInArray {
    public int secondLargest(int [] nums){

        // brute force: Get the largest and then get the second largest in 2 run for loop
        // Optimal is use 2 Pointers approach and 1 pointer will be tracking largest and seclargest will be prevLargest so far .... 

        int largest = nums[0];
        int secLargest = Integer.MIN_VALUE;

        for(int i =0; i< nums.length; i++){
            if(nums[i]>largest){
                secLargest = largest;
                largest = nums[i];
            }else if(nums[i]<largest && nums[i]>secLargest){
                secLargest = nums[i];
            }
        }   

        return secLargest == Integer.MIN_VALUE? -1: secLargest;
    }
}
