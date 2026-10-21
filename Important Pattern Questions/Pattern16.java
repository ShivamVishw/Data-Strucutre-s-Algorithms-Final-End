// Problem Link: https://takeuforward.org/practice/dsa/pattern-16



/**
 * Pattern Questions
 */
public class Pattern16 {

    public void pattern16(int n) {
        for(int row=1; row<=n; row++){
            for(int col =1; col<=row; col++){
                System.out.print((char) ('A' + row -1));
            }
            System.out.println();
        }
    }
    
}

// Output: 
// A

// BB

// CCC

// DDDD

// EEEEE