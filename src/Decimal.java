import java.util.Scanner;
public class Decimal {
    public static int g=0;
    //小数左对齐加法
    public static int[] zdqadd(int s2, int s4, int a[], int b[]){
        g=0;
        int m=s2-1, n=s4-1;
        int e=0,f=0;
        if(m>n){
            while(n>=0){
                e = a[n] + b[n] + g;
                f = e % 10;
                a[n--]= f;
                g = e / 10;
            }
            return a;
        }
        else {
            while (m >= 0) {
                e = a[m] + b[m] + g;
                f = e % 10;
                b[m--] = f;
                g = e / 10;
            }
            return b;
        }
    }
    //加法
    public static void add(String s1,String s2,String s3,String s4){
        int ints1, ints3, ints2, ints4;
        ints1 = Integer.parseInt(s1);
        ints3 = Integer.parseInt(s3);
        char[] char2 = s2.toCharArray();
        char[] char4 = s4.toCharArray();
        int a[] = new int[1000];
        int b[] = new int[1000];
        int i=s2.length()-1, j=s4.length()-1;
        while(i>=0){
            a[i]=char2[i]-'0';
            i--;
        }
        while(j>=0){
            b[j]=char4[j]-'0';
            j--;
        }
        int[] result = zdqadd(s2.length(), s4.length(), a, b);
        int m=s2.length(), n=s4.length();
        int integer = g + ints1 + ints3;
        System.out.print("加法结果为：" + integer + '.');
        if(m>n){
            for(int k=0; k<s2.length(); k++){
                System.out.print(result[k]);
            }
            System.out.println();
        }
        else{
            for(int k=0; k<s4.length(); k++){
                System.out.print(result[k]);
            }
            System.out.println();
        }
    }
    //乘法
    public static void multiply(String s1,String s2,String s3,String s4){
        int ints1, ints3, ints2, ints4, i=0, j=0, k=0;
        ints1 = Integer.parseInt(s1);
        ints3 = Integer.parseInt(s3);
        ints2 = Integer.parseInt(s2);
        ints4 = Integer.parseInt(s4);
        int a[] = new int[1000];
        int b[] = new int[1000];
        int c[] = new int[1000];
        //整数乘整数部分
        int integer1 = ints1 * ints3;
        int m=s2.length(), n=s4.length(), l=s2.length() + s4.length();
        //整数乘小数部分1
        int integer2 = ints1 * ints4 / ((int)Math.pow(10, (double)n));
        int decimal1 = ints1 * ints4 % ((int)Math.pow(10, (double)n));n--;
        while(decimal1!=0){
            i++;
            a[n--]= decimal1 % 10;
            decimal1 = decimal1 / 10;
        }
        if(n>0){
            while(n>=0){
                i++;
                b[n--]=0;
            }
        }
        //整数乘小数部分2
        int integer3 = ints3 * ints2 / ((int)Math.pow(10, (double)m));
        int decimal2 = ints3 * ints2 % ((int)Math.pow(10, (double)m));m--;
        while(decimal2!=0){
            j++;
            b[m--]= decimal2 % 10;
            decimal2= decimal2 / 10;
        }
        if(m>0){
            while(m>=0){
                j++;
                b[m--]=0;
            }
        }
        //小数乘小数部分
        int integer4 = ints2 * ints4 / ((int)Math.pow(10, (double)l));
        int decimal3 = ints2 * ints4 % ((int)Math.pow(10, (double)l));l--;
        while(decimal3!=0){
            k++;
            c[l--]= decimal3 % 10;
            decimal3= decimal3 / 10;
        }
        if(l>0){
            while(l>=0){
                k++;
                c[l--]=0;
            }
        }
        int[] result1 = zdqadd(i, k, a, c);
        int g1=g;
        int[] result2 = zdqadd(j, k, b, result1);
        int g2=g;
        int integer = g1 + g2 + integer1 + integer2 + integer3 + integer4;
        System.out.print("乘法结果为：" + integer + '.');
        for(int d=0; d<k; d++){
            System.out.print(result2[d]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String s1, s2, s3, s4;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个数的整数位和小数位:");
        s1 = in.next();
        s2 = in.next();
        System.out.println("请输入第二个数的整数位和小数位:");
        s3 = in.next();
        s4 = in.next();
        add(s1, s2, s3, s4);
        multiply(s1, s2, s3, s4);
    }
}
