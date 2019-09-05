import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input:");
        int n = input.nextInt();
        fibonacci(n);
        System.out.println("第"+(n+1)+"项溢出。");
    }
    public static void fibonacci(int n) {
        int a =1, b= 1, c =0;
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
