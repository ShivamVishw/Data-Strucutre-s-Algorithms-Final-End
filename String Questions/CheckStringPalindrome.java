// TUF Problem Link: https://takeuforward.org/practice/dsa/palindrome-check
// LeetCode Problem Link: https://leetcode.com/problems/valid-palindrome/



public class CheckStringPalindrome {
    // brutte force solution 
    // public boolean isPalindromes(String s) {
    //     StringBuilder cleaned  = new StringBuilder();

    //     for(int i =0; i<s.length(); i++){
    //         char ch = s.charAt(i);

    //         if(Character.isLetterOrDigit(ch)){
    //             cleaned.append(Character.toLowerCase(ch));
    //         }
    //     }

    //     String original = cleaned.toString();
    //     String reversed = cleaned.reverse().toString();

    //     return original.equals(reversed);
    // }


    // Optimal solution : 2 Pointer 
    public boolean isPalindrome(String s) {
        int i = 0; 
        int left = 0; 
        int right = s.length() -i-1;

        while(left<right){

            // skip non alphanumeric 
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;  // skipping
            }

            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;  // skipping
            }

            // Now compare 
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
