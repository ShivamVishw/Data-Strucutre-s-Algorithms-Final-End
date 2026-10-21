// TUF Problem Link: https://takeuforward.org/practice/dsa/check-if-the-array-is-sorted-i


public class CheckIfArraySorted1 {
    boolean arraySortedOrNot(int[] arr, int n) {
        for(int first =0; first<n-1; first ++){
           for(int second = first+1; second<n; second++){
             if(arr[first]> arr[second]){
                 return false;
             }
           }
 
        }
 
        return true;
     }
}
