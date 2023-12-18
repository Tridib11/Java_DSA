package Bitmanipulation;

public class resetithbit {
    public static void main(String[] args) {
        System.out.println(reset(15,5));
    }
    static int reset(int n,int i){
        return n&(~(1<<(n-1)));
    }
}
