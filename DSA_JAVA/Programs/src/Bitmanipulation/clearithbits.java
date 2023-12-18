package Bitmanipulation;

public class clearithbits {
    public static void main(String[] args) {
        System.out.println(clear(10,2));
    }
    static int clear(int n,int i){
        return n&(-1<<i);
    }
}
