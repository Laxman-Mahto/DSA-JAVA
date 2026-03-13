package arrayfifteen;

public class twopais {
    public static void printpairs(int numbers []){
        int tp=0; // declare new vairable
        for(int i=0; i<numbers.length;i++){
            int current=numbers[i]; //2,3,4,5,6,7,
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+current+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs  = " + tp); // it will print the total  pairses of the array

    }
    public static void main(String[] args) {
        int numbers[]= {2,3,4,5,6,7,8};
        printpairs(numbers);

    }
}
