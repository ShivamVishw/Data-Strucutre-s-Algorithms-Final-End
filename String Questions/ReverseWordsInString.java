// GFG Problem Link: https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
// LeetCode Problem Link: https://leetcode.com/problems/reverse-words-in-a-string/description/


public class ReverseWordsInString {
    public String reverseWords(String s) {
        
        // get the length first 
        int n = s.length();

        // convert this string s into mutable so that we can do manipulations using String builder 
        StringBuilder sb= new StringBuilder(s);

        // reverse the whole string 
        sb.reverse();

        // final ans stringbuilder object to store reversed final string 
        StringBuilder ans = new StringBuilder();

        int i =0;
        while(i<n){
            // skip the spaces until current index have spaces 
            while(i<n && sb.charAt(i) == ' '){
                i++;
            }

            // so till now starting spaces have skipped so it means new words found here so it will be starting index of new word 
            int start = i;

            // now find end index of word 
            while(i<n && sb.charAt(i) != ' '){
                //  until not getting any spaces keep going 
                i++;
            }

            // so it means space found at current so our word will be new word -- (start, i);
            // extract the word and reverse it 
            if(start<i){
                StringBuilder word = new StringBuilder(sb.substring(start, i));

                // reverse the current individiual word 
                word.reverse();


                // now if this is not first word 
                if(ans.length() > 0){
                    ans.append(' ');   // add spaces 
                }

                ans.append(word);
            }

        }

        return ans.toString();

    }
}
