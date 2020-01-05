package 上课;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input:");
        int n = input.nextInt();
        fibonacci1(n);
        System.out.println("第"+47+"项溢出。");
    }
    private static void fibonacci1(int n) {
        int a =1, b= 1, c;
        if (n < 1) {
            System.out.println(-1);
        }
        else if (n ==1 || n == 2) {
            System.out.println(1);
        }
        else {
            System.out.print("1 1 ");
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
                if (i % 10 == 0)
                    System.out.println();
            }
            System.out.println();
        }
    }
}
