package arraysixteen;

public class selectionsorttt {
//    public static void selectionSort(int arr[]){
//        for(int turn=0; turn<arr.length-1; turn ++){
//            for(int j=0;j<arr.length-1-turn; j++){
//                if(arr[j]> arr[j+1]){
//                    //swap krdo
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }
//    public static void printarr(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println();
//    }
// ye bubble sort tha esko comment krdiyaaa an dthen wrote the selection codew
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int maxPos=i; // maine i jo current object ka position hai usko max position declare kr diya

            for(int j=i+1;j<arr.length;j++){
                if(arr[maxPos]>arr[j]){
                        maxPos=j;
                }
            }
            //swap ab
            int temp=arr[maxPos];
            arr[maxPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,3,9,2};
        selectionSort(arr);
        printarr(arr);

    }
}
