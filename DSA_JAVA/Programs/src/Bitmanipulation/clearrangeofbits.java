package Bitmanipulation;

public class clearrangeofbits {
    public static void main(String[] args) {
        System.out.println(range(10,2,4));

    }
    static int range(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
}
