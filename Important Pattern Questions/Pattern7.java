// Problem Link: https://takeuforward.org/practice/dsa/pattern-7


/**
 * Pattern Questions
 */
public class Pattern7 {

    public void pattern7(int n) {
        for(int row =1; row<=n; row++){
            
            // print spaces
            for(int col =1; col<= n-row; col++){
                System.out.print(" ");
            }

            // print stars 
            for(int col = 1; col<= 2*row-1; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}

// Output: 
//     *
//    ***
//   *****
//  *******
// *********