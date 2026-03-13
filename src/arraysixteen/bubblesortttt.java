package arraysixteen;

public class bubblesortttt {
    public static void bubblesort(int arr[]){
        // ekbaar notes dekho acche se
        for(int turn=0;turn<arr.length-1;turn ++){

            for(int j=0;j<arr.length-1-turn;j++){]

                if(arr[j]>arr[j+1]){

                    //fer swap krdoo
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //here making the second function...

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            // only print...for to get the arr only in ore line
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,3,8,233};
        bubblesort(arr);
        printarr(arr);

    }
}
