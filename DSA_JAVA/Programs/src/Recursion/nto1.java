package Recursion;

public class nto1 {
    public static void main(String[] args) {
        func(9);
    }
    static void func(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n+" ");
        func(n-1);
    }
}
