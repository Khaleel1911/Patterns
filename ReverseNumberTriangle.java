// Reverse Number Triangle Pattern
// 1 2 3 4 5 
//  2 3 4 5 
//   3 4 5 
//    4 5 
//     5 
import java.util.*;
public class ReverseNumberTriangle {

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      for(int i=1;i<=n;i++){
        
       for(int j=1;j<=i;j++){
         System.out.print(" ");
       }
        for(int k=i;k<=n;k++){
          System.out.print(k+" ");
        }
       System.out.println();
      }
  }
}