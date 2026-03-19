package Recursion_22;

public class fib {
    public static int fib(int n){
        if(n==0||n==1){
           return n;
        } //neeche2 recursive call ho rhi hai
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn =fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n =20;
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(25));

    }
}
