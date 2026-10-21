// Problem Link: https://takeuforward.org/practice/dsa/pattern-18


/**
 * Pattern Questions
 */
public class Pattern17 {

    public void pattern18(int n) {
        int temp = n;
        for(int row=1; row<=n; row++){
            temp = n-row+1;
            for(int col =1; col<=row; col++){
                System.out.print((char) ('A' + temp -1)+" ");
                temp++;
                
            }
            System.out.println();
        }
    }
    
}

// output: 
// E 

// D E 

// C D E 

// B C D E 

// A B C D E