// Problem Link: https://takeuforward.org/practice/dsa/pattern-8


/**
 * Pattern Questions
 */
public class Pattern8 {

    public void pattern8(int n) {
        for(int row = 1; row<=n; row++){
            
            // print spaces
            for(int spaceCol = 1; spaceCol< row; spaceCol++){
                System.out.print(" ");
            }

            // print stars
            for(int starsCol = 1; starsCol<= 2*n-2*row+1; starsCol++){
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }
    
}

// Output: 
// *********
//  *******
//   *****
//    ***
//     *