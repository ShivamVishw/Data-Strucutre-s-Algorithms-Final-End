// LeetCode Problem Link: https://leetcode.com/problems/is-subsequence/description/



public class CheckIfSIsSubsequenceOfT {
    public boolean isSubsequence(String s, String t) {
        int i =0; 
        int j =0;

        while (i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                // letter match or found in t then move i in s to find next letter in t 
                i++;
            }

            j++;
        }

        // because if any value not available in t then due to condition && i will never reach end 
        // and if i reached end it mens s is subsequence of t string.
        
        return i== s.length(); 
    }
}
