import java.util.Scanner;
public class dsjcxj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] r = new int[1000];
        System.out.println("请输入阶乘数:");
        int f = input.nextInt();
        int b = 1;
        int length = 1;
        r[0] = 1;
        while(b <= f){
            int m = 0;
            int i;
            for (i = 0; i < length; i++){
                int g = r[i] * b + m;
                r[i] = g % 10;
                m = g / 10;
            }
            while(m != 0){
                r[i++] = m % 10;
                m = m / 10;
            }
            b++;
            length++;
        }
        for (int k = length - 1; k >= 0; k--){
            System.out.print(r[k]);
        }
    }
}
