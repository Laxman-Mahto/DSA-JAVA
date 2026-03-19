package Recursion_22;

public class araysortornot {
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        //when the array is sorted
        //int arr[]={1,2,3,4,5,6};
       // System.out.println(isSorted(arr,0));

        //if the array is not sorted
        int arr[]={1,2,3,5,2};
        System.out.println(isSorted(arr,0));


    }
}
