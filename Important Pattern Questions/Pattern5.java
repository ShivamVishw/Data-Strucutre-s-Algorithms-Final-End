// Problem Link: https://takeuforward.org/practice/dsa/pattern-5


/**
 * Pattern Questions
 */
public class Pattern5 {

    public void pattern5(int n) {
        for(int i =n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

// Output:
// *****

// ****

// ***

// **

// *