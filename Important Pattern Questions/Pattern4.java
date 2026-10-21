// Problem Link: https://takeuforward.org/practice/dsa/pattern-4



/**
 * Pattern Questions
 */
public class Pattern4 {

    public void pattern4(int n) {
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }   
    }
    
}


// Output: 

// 1
// 22
// 333
// 4444
// 55555