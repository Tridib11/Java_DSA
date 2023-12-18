package Bitmanipulation;

public class getithbit {
    public static void main(String[] args) {
        System.out.println(find(3,1));

    }
    static int find(int n,int i){
        if((n&1<<i)==0){
            return 0;
        }else {
            return 1;
        }
    }
}
