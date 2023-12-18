package Recursion;

public class One_To_n {
    public static void main(String[] args) {
        rec(5);
    }
    static void rec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        rec(n-1);
        System.out.println(n);
    }
}
