package Recursion;

public class digitproduct {
    public static void main(String[] args) {
        System.out.println(product(505));

    }
    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*product(n/10);
    }
}
