package Bitmanipulation;

public class firstrmb {
    public static void main(String[] args) {
        System.out.println(rsb(16));
    }

    static int rsb(int n){
        int set=n&-n;
        int count=0;
        while(set!=0){
            set=set>>1;
            count++;
        }
        return count;
    }
}
