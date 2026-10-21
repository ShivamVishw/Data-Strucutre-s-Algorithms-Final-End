// LeetCode Problem Link: https://leetcode.com/problems/string-compression/description/


public class StringCompression {
    public int compress(char[] chars) {

        // result builder object 
        StringBuilder result = new StringBuilder();

        // get the length 
        int n = chars.length;
        int i =0;

        while(i<n){

            // get the current letter 
            char current = chars[i];

            // count track 
            int count =0;

            // keep moving until current letter keep found
            while(i<n && chars[i] == current){
                count ++;
                i++;
            }

            // add the current letter into result 
            result.append(current);

            // if count is >1 then will add count after current letter 
            if(count >1){
                result.append(count);
            }
        }

        // Copy once, after compression is complete
        for (int j = 0; j < result.length(); j++) {
            chars[j] = result.charAt(j);
        }

        return result.length();

    }
}
