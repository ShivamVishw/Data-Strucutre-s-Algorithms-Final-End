// LeetCode Problem Link: https://leetcode.com/problems/reverse-vowels-of-a-string/description/
// GFG Problem Link: https://www.geeksforgeeks.org/problems/reversing-the-vowels5304/1



public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char [] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while(left<right){

            // keep moving until its not vowel 
            while(left < right && !isVowel(chars[left])){
                left ++;
            }

            // keep moving until its not vowel 
            while(left < right && !isVowel(chars[right])){
                right --;
            }

            // now we encoiunterd vowels from both side so swap it 
            char temp = chars[left]; 
            chars[left] = chars[right];
            chars[right] = temp;

            // update left and right to move furthere with next characters 
            left ++;
            right --;
        }

        return new String(chars);
    }

    boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}
