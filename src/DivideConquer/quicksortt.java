package DivideConquer;

public class quicksortt {
    public static void printArr(int arr[]) {
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //chlo mana hamne last element pivot liya hai
        //pidx means partitioon indes
        int pIdx=partition(arr,si,ei);
        quicksort(arr,si,pIdx-1); //left side
        quicksort(arr,ei,pIdx+1);//right side
    }
    //now fucntion or partition
    public static int partition(int arr[],int si,int ei) {
        int pivot = ei; //hamne last ko mana tha uper remember this
        int i=si-1;

        for (int j=si ;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //now swap the valu
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[] = {2,50,4,70,8,3,6};
        quicksort(arr,0,arr.length-1);
        printArr(arr);

    }
}
