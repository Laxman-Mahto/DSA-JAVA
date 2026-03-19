package Recursion_22;

public class firstoccurance {
    public static int firstoccurance(int arr[], int key,int i){
        if(i==arr.length){
            return -i;
        }
        if (arr[i]==key){
            return i;
        }
        return firstoccurance(arr ,key ,i+1);
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,7,9,3,9,5,6};
        System.out.println(firstoccurance(arr ,67,2));

    }
}
