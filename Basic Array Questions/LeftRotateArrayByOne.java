// TUF Problem Link: https://takeuforward.org/practice/dsa/left-rotate-array-by-one

public class LeftRotateArrayByOne {
    public void leftRotateByOne(int nums[]){
        int temp = nums[0];

        for(int i =1; i<nums.length; i++){
            nums[i-1] = nums[i];
        }

        nums[nums.length-1] = temp;
    }
}
