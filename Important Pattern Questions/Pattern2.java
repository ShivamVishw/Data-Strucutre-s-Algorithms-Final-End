// Problem Link: https://takeuforward.org/practice/dsa/pattern-2

class Pattern2 {

    public void pattern2(int n) {
        for(int i =0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    
}


// *

// **

// ***

// ****

// *****