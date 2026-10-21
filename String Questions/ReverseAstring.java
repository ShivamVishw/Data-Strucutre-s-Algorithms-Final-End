// LeetCode Problem Link: https://leetcode.com/problems/reverse-string/description/


public class ReverseAstring {
    public void reverseString(char[] s) {
        // Use 2 pointer approach 
        int i =0;

        // left pointer 
        int left  = i ;

        // right pointer 
        int right = s.length -i-1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left ++;   // move towords end of the array
            right--;   // move towards front side of the array 
        }


    }
}
