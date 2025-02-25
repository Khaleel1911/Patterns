// Number Increasing Reverse Pyramid
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1
import java.util.Scanner;
public class NumIncRevPyramid {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
