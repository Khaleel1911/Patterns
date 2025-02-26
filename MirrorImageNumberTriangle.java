// Mirror Image Number Triangle Pattern
//1 2 3 4 
// 2 3 4 
//  3 4 
//   4 
//  3 4 
// 2 3 4 
//1 2 3 4 
import java.util.*;
public class MirrorImageNumberTriangle {

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      //upper triangle 
      for(int i=1;i<=n;i++){
        
       for(int j=1;j<i;j++){
         System.out.print(" ");
       }
        for(int k=i;k<=n;k++){
          System.out.print(k+" ");
        }
       System.out.println();
      }
      
      // lower triagle 
      for(int i=n-1;i>=1;i--){
        
       for(int j=1;j<i;j++){
         System.out.print(" ");
       }
        for(int k=i;k<=n;k++){
          System.out.print(k+" ");
        }
       System.out.println();
      }
  }
}