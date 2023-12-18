package Recursion;

public class powerofxandn {
    public static void main(String[] args) {
        System.out.println(pow(2,6));
    }
    static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int xm1=x*pow(x,n-1);
        return xm1;
    }
}
