package Bitmanipulation;

public class findkthbitinnbinarystrings {
    public static void main(String[] args) {
        System.out.println(findKthbit(3,1));
    }

    static char findKthbit(int n,int k){
        if((n&1<<k)==0){
            return '0';
        }else {
            return '1';
        }

    }
}
