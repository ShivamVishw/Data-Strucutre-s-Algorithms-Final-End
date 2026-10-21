// Problem Link: https://takeuforward.org/practice/dsa/pattern-10


/**
 * Pattern Questions
 */
public class Pattern10 {

    public void pattern10(int n) {
        for(int row=1; row< 2*n; row++){
            int totalnoofrows = row>n ? 2*n-row : row;
            for(int col =1; col<=totalnoofrows; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

// Output: 
// *

// **

// ***

// ****

// *****

// ****

// ***

// **

// *