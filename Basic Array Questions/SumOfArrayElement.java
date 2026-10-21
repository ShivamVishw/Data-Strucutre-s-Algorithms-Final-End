// TUF Problem Link: https://takeuforward.org/practice/dsa/sum-of-array-elements


public class SumOfArrayElement {
    public int sum(int arr[], int n) {
        
        int sum =0;

        for(int num : arr){
            sum+=num;
        }

        return sum;
    }
}
