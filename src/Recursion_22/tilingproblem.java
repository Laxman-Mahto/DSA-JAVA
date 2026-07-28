package Recursion_22;

public class tilingproblem {
    public static int tailingprob(int n){
        if (n==0 || n==1){
            return 1;
        }
        //kaam kii baat
        //vertical
        int fnm1=tailingprob(n-1);

        //horizontal
        int fnm2=tailingprob(n-2);

        //both total
        int totalways=fnm1 + fnm2;
        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(tailingprob(2)); //2
        System.out.println(tailingprob(3)); //`3
        System.out.println(tailingprob(4)); //5

        //when n is 4,..o/p will be 5 cos its recursive,,,prev two element sum = next element haha
        //prev two=3+2=5



    }
}
