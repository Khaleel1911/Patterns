// Diamond Pattern 
//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 
// * * * * * * 
//  * * * * * 
//   * * * * 
//    * * * 
//     * * 
//      * 

import java.util.Scanner;

public class Diamond {
    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            // Printing leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
