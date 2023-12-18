package Bitmanipulation;

public class clearithbit {
    public static void main(String[] args) {
        System.out.println(clear(10,2));
    }
    static int clear(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
}
