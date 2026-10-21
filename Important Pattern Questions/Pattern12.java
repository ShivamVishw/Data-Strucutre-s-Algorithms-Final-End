// Problem Link: https://takeuforward.org/practice/dsa/pattern-12


/**
 * Pattern Questions
 */
public class Pattern12 {

    public void pattern12(int n) {
        for(int row=1; row<=n; row++){
            // 1st column part(increasing number)
            for(int col =1; col<= row; col++){
                System.out.print(col);
            }

            // 2nd colomn part(spaces)
            for(int col=1 ; col<=2*(n-row); col++){
                System.out.print(" ");
            }

            // 3rd column part(decreasing number)
            for(int col=row; col>=1; col--){
                System.out.print(col);
            }

            System.out.println();

        }
    }
    
}
// Output: 
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321