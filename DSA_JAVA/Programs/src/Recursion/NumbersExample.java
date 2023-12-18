package Recursion;

public class NumbersExample {

    /*when ever a function is called it goes into the Stack memory and while the function is not executing it will
    still remain in the stack . ... When a fucntion finishes executing it is removed from the stack and the flow of thw
     */
    public static void main(String[] args) {
        print1(1);

    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}
