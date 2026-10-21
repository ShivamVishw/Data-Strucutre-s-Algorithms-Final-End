// TUF Problem Link: https://takeuforward.org/practice/dsa/reverse-a-number
// LeetCode Problme Link: https://leetcode.com/problems/reverse-integer/


public class ReverseNumber {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int rem = x % 10;

            // Overflow check: if reverse is already outside the safe range,
            // multiplying by 10 will overflow
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10)
                return 0;

            reverse = reverse * 10 + rem;
            x = x / 10;
        }
        return reverse;
    }
}
