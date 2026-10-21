// LeetCode Problem Link: https://leetcode.com/problems/valid-anagram/description/
// GFG Problem Link: https://www.geeksforgeeks.org/problems/anagram-1587115620/1


public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // base case
        if(s.length() != t.length()){
            return false;
        }

        int freq [] = new int [26]; // expecting only lowercase letters 

        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++; // increment in s 
            freq[t.charAt(i) - 'a']--; // decrement in t 
        }

        for(int count : freq){
            if(count !=0){
                return false;
            }
        }


        return true;
    }
}
