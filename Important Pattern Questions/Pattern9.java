// Problem Link: https://takeuforward.org/practice/dsa/pattern-9


/**
 * Pattern Questions
 */
public class Pattern9 {

    public void pattern9(int n) {
        // So we will solve this in 2 parts 
        // 1st parts
        for(int row=1; row<=n; row++){
            // print spaces
            for(int col =1; col <= n-row; col++){
                System.out.print(" ");
            }

            // print stars
            for(int col =1; col<=2*row-1; col++){
                System.out.print("*");
            }

            System.out.println();
        }

        // 2nd part 
        for(int row=1; row<=n; row++){
            
            // print spaces
            for(int col=1; col< row; col++){
                System.out.print(" ");
            }

            //print stars
            for(int col=1; col<= 2*n-2*row+1; col++){
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
// *********
//  *******
//   *****
//    ***
//     *