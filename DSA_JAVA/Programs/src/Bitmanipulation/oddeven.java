package Bitmanipulation;

public class oddeven {
    public static void main(String[] args) {
        oe(3);
        oe(6);
    }
    static void oe(int n){
        int bitmask=1;
        if((n&bitmask)==1){
            System.out.println("Odd Number");
        }
        else {
            System.out.println("Even number");
        }
    }
}
