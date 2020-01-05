package 上课;

import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input:");
        int n = input.nextInt();
        matrix(n);
    }
    public static void matrix(int n){
        int k=1,m=n;
        int [][]s = new int[20][20];
        while(k<=n/2)
        {
            for(int j=k;j<=m;j++)
            {
                s[k][j]=k;
                s[m][j]=k;
                s[j][m]=k;
                s[j][k]=k;
            }
            k++;
            m--;
        }
        if(n%2!=0)
        {
            s[n/2+1][n/2+1]=n/2+1;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}

