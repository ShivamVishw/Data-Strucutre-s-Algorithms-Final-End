// Problem Link: https://takeuforward.org/practice/dsa/pattern-6


/**
 * Pattern Questions
 */
public class Pattern6 {

    public void pattern6(int n) {
        for(int i =n; i>=1; i--){
            for(int j =1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}

// Output: 
// 12345
// 1234
// 123
// 12
// 1