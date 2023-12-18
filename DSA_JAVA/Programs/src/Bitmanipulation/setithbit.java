package Bitmanipulation;

public class setithbit {
    public static void main(String[] args) {
        System.out.println(set(10,2));
    }
    static int set(int n,int i){
        return n|1<<i;
    }
}
