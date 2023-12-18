package Bitmanipulation;

public class chechifthenumberispoweroftwo {
    public static void main(String[] args) {
        System.out.println(power(8));

    }
    static boolean power(int n){
        return (n&(n-1))==0;
    }
}
