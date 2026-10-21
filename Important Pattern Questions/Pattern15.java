// Problem Link: https://takeuforward.org/practice/dsa/pattern-15



/**
 * Pattern Questions
 */
public class Pattern15 {

    public void pattern15(int n) {
        for(int row=n; row>=1; row--){
            for(int col =1; col<=row; col++){
                System.out.print((char) ('A' + col -1));
            }
            System.out.println();
        }
    }
    
}

// output:  

// ABCDE

// ABCD

// ABC

// AB

// A