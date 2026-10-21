// Problem Link: https://takeuforward.org/practice/dsa/pattern-21


/**
 * Pattern Questions
 */
public class Pattern18 {

    public void pattern21(int n) {
        for(int row =1; row<=n; row++){
            for(int col =1; col<=n; col++){
                if(row==1 || col==1 || row==n || col==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}

// output:
// *****
// *   *
// *   *
// *   *
// *****