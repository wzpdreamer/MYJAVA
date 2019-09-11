import java.util.Scanner;
public class Complex {
    private double a,b;
    public Complex() {
        this.a = 0.0;
        this.b = 0.0;
    }
    public Complex(double a,double b) {
        this.a=a;
        this.b=b;
    }
    public void print() {
        if(b!=0) {
            if(a==0) {
                System.out.println(b+"i");
            }
            else {
                if(b<0) {
                    System.out.print(a);
                    System.out.println(b + "i");
                }
                else{
                    System.out.println(a + "+" + b +"i");
                }
            }
        }
        else {
            System.out.println(a);
        }
    }
    public Complex add(Complex C) {
        return new Complex(this.a+C.a,this.b+C.b);
    }
    public Complex minus(Complex C) {
        return new Complex(this.a-C.a,this.b-C.b);
    }
     /*复数的乘法运算 z = x * y的运算法则是：
     z.实部 = x.实部 * y.实部 - x.虚部 * y.虚部
     z.虚部 = x.实部 * y.虚部 + x.虚部 * y.实部*/
    public Complex multiply(Complex C) {
        double c1 = this.a*C.a - this.b*C.b;
        double c2 = this.a*C.b + this.b*C.a;
        return new Complex(c1,c2);
    }
     /*复数的除法运算 z = x / y 的运算法则是：
     z.实部 = (x.实部 * y.实部 + x.虚部 * y.虚部) / (y.实部* y.实部 + y.虚部 * y.虚部)
     z.虚部 = (x.虚部 * y.实部 - x.实部 * y.虚部) / (y.实部 * y.实部 + y.虚部 * y.虚部)*/
    public Complex divide(Complex C) {
        if(C.a==0.0&&C.b==0.0) {
            System.err.println("除数不能为0！");
            return new Complex();
        }
        double c1 = (this.a*C.a + this.b*C.b) / (C.a*C.a + C.b*C.b);
        double c2 = (this.b*C.a - this.a*C.b) / (C.a*C.a + C.b*C.b);
        return new Complex(c1,c2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个复数的实部和虚部:");
        double e = in.nextDouble();
        double f = in.nextDouble();
        System.out.println("请输入另一个复数的实部和虚部:");
        double g = in.nextDouble();
        double h = in.nextDouble();
        Complex x = new Complex(e, f);
        Complex y = new Complex(g, h);
        System.out.print("x:");
        x.print();
        System.out.print("y:");
        y.print();
        System.out.print("(x + y) = ");
        x.add(y).print();
        System.out.print("(x - y) = ");
        x.minus(y).print();
        System.out.print("(x * y) = ");
        x.multiply(y).print();
        System.out.print("(x / y) = ");
        x.divide(y).print();
    }
}
