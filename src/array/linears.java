package array;

public class linears {
    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return 1;

            }
        }
        return -1;


    }
    public static void main(String[] args) {
        int numbers [] = {2,3,4,5,6,7,8,9,23};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.println(" not found");
        }else {
            System.out.println("key is at index :" + index);
        }
    }
}
