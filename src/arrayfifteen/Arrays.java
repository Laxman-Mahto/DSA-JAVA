package arrayfifteen;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int marks[] = new int[50];
//        int numbers[] = {1,2,3};
//        String fruit[] = {"apple", "mango"};
//        System.out.println();


        int marks[] = new int[10];
        // array size 10 de diya
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("bio : " + marks[3]);
        System.out.println("maths : " + marks[4]);



        //update marks
        marks[2] = 100;
        System.out.println("che : "+ marks[2]);
        int percentage =(marks[0]+ marks[1] + marks[2]) / 3;
        System.out.println("Percentage : " + percentage + "%");

        //lenght of aarray

        System.out.println("lengths of array = " + marks.length);

        
    }
}
