// Problem Link: https://takeuforward.org/practice/dsa/pattern-14


/**
 * Pattern Questions
 */
public class Pattern14 {

    public void pattern14(int n) {
        for(int row=1; row<=n; row++){
            for(int col =1; col<=row; col++){
                System.out.print((char) ('A' + col -1));
            }
            System.out.println();
        }
    }
    
}

// output: 
// A

// AB

// ABC

// ABCD

// ABCDE