import java.util.Scanner;
public class dsjc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入阶乘数:");
        int n = in.nextInt();
        int[] a=new int[1000];
        int[] b=new int[1000];
        a[0]=1;
        int i,c,d,e=0,alength=1,blength=0;
        for(int k=1;k<=n;k++)
        {
            for(i=alength-1;i>=0;i--){
                c=a[i]*k;
                c=e+c;
                d=c%10;
                b[blength++]=d;
                e=c/10;
            }
            while(e != 0){
                b[blength++]=(e%10);
                e = e / 10;
            }
            int m=0,q=blength-1;
            while(m<blength){
                a[m++]=b[q--];
            }
            alength=blength;
            blength=0;
        }
        for(int k=0;k<alength;k++) {
            System.out.print(a[k]);
        }
    }
}
