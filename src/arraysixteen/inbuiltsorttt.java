package arraysixteen;
import java.util.Arrays;

public class inbuiltsorttt {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
//    Here if we dont write the print arr thn it will -
//    Run successfully ✅
//    Sort the array ✅
//    Show no output ❌
    public static void main(String[] args) {
        int arr[]={1,6,3,8,3,9,5,2};
        Arrays.sort(arr);
        printarr(arr);
    }
}

