package Recursion;

public class firstnnaturalnumbers {
    public static void main(String[] args) {
        System.out.println(fnm(5));
    }
    static int fnm(int n){
        if(n==1){
            return 1;
        }
        int fnn=n+fnm(n-1);
        return fnn;
    }
}
