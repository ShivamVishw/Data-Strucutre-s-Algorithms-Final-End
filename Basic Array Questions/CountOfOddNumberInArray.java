// TUF Problem Link: https://takeuforward.org/practice/dsa/count-of-odd-numbers-in-array


public class CountOfOddNumberInArray {
    public int countOdd(int[] arr, int n) {
        int count =0;

        for(int num : arr){
            if(num%2 !=0){
                count ++;
            }
        }


        return count;
    }
}
