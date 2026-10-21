// TUF Problem Link: https://takeuforward.org/practice/dsa/reverse-an-array



public class ReverseAnArray {
    public void reverse(int[] arr, int n) {
        for(int i =0; i<n/2; i++){
            int front = i;
            int back = n-i-1;

            int temp = arr[front];
            arr[front] = arr[back];
            arr[back] = temp;
        }
    }
}
