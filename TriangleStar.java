// TriangleStar Pattern
//        * 
//       * * 
//      * * * 
//     * * * * 
//    * * * * * 
//   * * * * * * 
//  * * * * * * * 
// * * * * * * * * 
import java.util.*;
public class TriangleStar {

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      for(int i=1;i<=n;i++){
        
        for(int k=n;k>i;k--){
          System.out.print(" ");
        }
       for(int j=1;j<=i;j++){
         System.out.print("* ");
       }
       System.out.println();
      }
  }
}