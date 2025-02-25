// Number Increasing pyramid
//  1 
//  1 2 
//  1 2 3 
//  1 2 3 4 
//  1 2 3 4 5 

import java.util.Scanner;

public class NumIncPyramid {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
