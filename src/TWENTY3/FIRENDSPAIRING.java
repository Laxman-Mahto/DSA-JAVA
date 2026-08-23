package TWENTY3;

public class FIRENDSPAIRING {
    public static int f(int n)
    {
        if (n==1||n==2){
            return n;
        }
            //choice
        //single
        int fnm1= f(n-1);
        //pair
        int fnm2 = f(n-2);
        int pairways = (n-1) * fnm2;
        //totalways
        int totalways = fnm1 + pairways;
        return totalways;

    }
    public static void main(String args[]) {
        System.out.println(f(3));
    }

}
