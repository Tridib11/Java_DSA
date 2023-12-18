package Recursion;

public class reverseusingresursion {
    public static void main(String[] args) {
        System.out.println(pal(213,0));

    }

    static int pal(int n,int sum){
        if(n==0){
            return sum;
        }
        sum=(sum*10)+(n%10);
        return pal(n/10,sum);
    }
}
