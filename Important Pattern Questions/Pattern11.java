// Problem Link: https://takeuforward.org/practice/dsa/pattern-11


/**
 * Pattern Questions
 */
public class Pattern11 {

    public void pattern11(int n) {
        for(int row=1; row<=n; row++){
            for(int col =1; col<=row; col++){
                if((row+col)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 "); 
                }
            }   
            System.out.println();
        }
    }
    
}

// Output: 
// 1 

// 0 1 

// 1 0 1 

// 0 1 0 1 

// 1 0 1 0 1