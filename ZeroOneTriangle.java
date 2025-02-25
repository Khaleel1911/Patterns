// Zero-One Triangle
// 1 
// 0 1 
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
import java.util.Scanner;

public class ZeroOneTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            flag = (i % 2 == 0) ? 0 : 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(flag+" ");
                flag=(flag==0? 1 : 0);
            }
            System.out.println();
        }
    }
}
