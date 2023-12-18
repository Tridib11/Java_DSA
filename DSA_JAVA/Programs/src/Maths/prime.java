package Maths;

public class prime {
    public static void main(String[] args) {
        System.out.println(prime(10));
    }
    static int prime(int n){
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                count++;
            }
        }
        return count;
    }
}
