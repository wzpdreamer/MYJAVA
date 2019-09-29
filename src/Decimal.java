class MyException1 extends Exception{
    public MyException1(){};
    public MyException1(String msg){super(msg);}
}
class MyException2 extends Exception{
    public MyException2(){};
    public MyException2(String msg){super(msg);}
}
public class Decimal {
    public static void g() throws MyException2{
        System.out.println("Throwing MyException from g()");
        throw new MyException2("Originated from g()");
    }
    public static void f() throws MyException1{
        try{
            g();
        }catch(MyException2 e){
            System.out.println("Inside g(), e.printStackTrace()");
            e.printStackTrace(System.out);
        }
        System.out.println("Throwing MyException from f()");
        throw new MyException1("from f()");
    }
    public static void main(String[] args) {
        //Decimal s = new Decimal();
        try{
            f();
        } catch(MyException1 ex1){
            System.out.println("main: printStackTrace()");
            ex1.printStackTrace(System.out);
        }
        try{
            g();
        } catch(MyException2 ex2) {
            ex2.printStackTrace(System.out);
        }
    }
}
