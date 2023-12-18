package Bitmanipulation;

public class xorrange {
    public static void main(String[] args) {
        System.out.println(rangexor(4,8));

    }

    static int rangexor(int start, int end){
        int sum=0;
        for (int i = start; i <=end ; i++) {
            sum^=i;
        }
        return sum;
    }
}
