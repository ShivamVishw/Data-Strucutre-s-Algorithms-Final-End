// GFG Problem Link: https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

public class RightRotateArrayByOne {
    public void rightRotateByOne(int nums[]){

        int temp = nums[nums.length-1]; // last element 

        for(int i =nums.length-2; i>=0; i--){
            
            nums[i+1] = nums[i];
            // System.out.println(nums[i]);
        }

        nums[0] = temp;  // 0th position filled by last position
    }
}
