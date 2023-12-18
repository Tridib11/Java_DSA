package Recursion;

public class fiboformula {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibo_formula(i));
        }
        System.out.println(fibo_formula(50));
    }
    static long fibo_formula(int n){
        return (long) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}