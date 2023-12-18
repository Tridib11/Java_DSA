package Bitmanipulation;

public class findthemagicnumber {
    public static void main(String[] args) {
        System.out.println(magicnumber(6));

    }
    static int magicnumber(int n){
        int ans=0;
        int base=5;
        while(n!=0){
            int last=n&1;
            ans+=last*base;
            n=n>>1;
            base=base*5;
        }
        return ans;
    }
}
