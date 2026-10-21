// GFG Problem Link: https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1



public class MaximumFrequentCharacter {
    public static char getMaxOccuringChar(String s) {
        // code here
        int [] freq = new int[26];
        
        // increment count if characters found
        for(char curr : s.toCharArray()){
            freq[curr - 'a']++;
        }
        
        char freqChar = 'a';
        int max = Integer.MIN_VALUE;
        // Print frequencies
               for (int i = 0; i < 26; i++) {
                   if (freq[i] > 0) {
                       if(freq[i]>max){
                           max = freq[i];
                           freqChar = (char) (i+ 'a');
                       }
                   }
               }
        
        return freqChar;
    }
}
