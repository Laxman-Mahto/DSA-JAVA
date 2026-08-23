//wht is divide and conquer nd its code formation..nd ow it working...
package DivideConquer;


public class dc1 {
   //printArr arr function
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //mergesort ka recursive function
    public static void mergeSort(int arr[], int si,int ei){
        if(si >= ei){
            return;
        }
        //kaam ki baat
        int mid=(si+ei)/2;
        mergeSort(arr,si,mid); //left side
        mergeSort(arr,mid+1,ei); //right side
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei) {
        //merge krne k liye we are making a new temperory arry and usme store krenege
        //fer usme con use krenge store krne k liye in end temp array ko copy kenge original array mai done.
        int temp[]=new int[ei-si+1];
        //left side si (0,3)= 4 element
        //right side ei(4,6)=3 element
        //total e=4+3=7. so acc to cond- si is 0 and ei is 6= 6-0+1=7
        int i=si; //iterator 1 for left
        int j=mid+1; //iterator 2 for right
        int k=0;  //iterator 3 for temp arr

        //now cond
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp [k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++; //uper cond mai jpo bhi hoga execute hoga i ya j and uska value jo bhi ayega wo temp array mai store hoga intex 0 par..wse he k++ k agge bdhega 1 par index
        }
        //ab jo baki k elemts bach gaye wo
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy the temp to original array
        for(k=0;k<temp.length ; k++){
            arr[si +k]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,5,2,5,7,9,2,13};
        mergeSort(arr,0, arr.length-1);
        printArr(arr);

    }
}/
