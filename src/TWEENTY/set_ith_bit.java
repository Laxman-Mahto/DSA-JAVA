package TWEENTY;

public class set_ith_bit {
    public static int SetIthBit(int n, int i){
        int bitMask=1<<i;

        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(SetIthBit(10,2));

    }
}

// the naswer will be 14 , check the notes for the better understanding