package TWEENTY;

public class oddevenn {
    public static void oddoreven(int n){
        int bitmask =1;
        if((n & bitmask)==0){
            //even
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
    public static void main(String[] args) {
        oddoreven(2);
        oddoreven(9);
        oddoreven(6);
        oddoreven(99);

    }
}
