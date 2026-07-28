package Recursion_22;

public class lastoccurence {
    public static int lastoccurence(int arr[], int key , int i){
        if(i==arr.length){ //we check i with the all elements of the arr,,and if the element not found int he array then it will return -1..means invalid
            return -1;
        }

        int IsFound=lastoccurence(arr,key,i+1);
        if(IsFound==-1 && arr[i]==key){
            return i;
        }
        return IsFound;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,3,8,7};
        System.out.println(lastoccurence(arr,7,0));

        //asign key something other the array elemetns it will return the -1...cos the loop checked or comaprison with all
        //elemetns of arry and dint found so -1
        //System.out.println(lastoccurence(arr,11,0));

    }

}
