package Recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
    static int power(int n,int powe){
        if(powe==0){
            return 1;
        }
        return n*power(n,powe-1);
    }
}
