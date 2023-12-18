package Bitmanipulation;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int n=2;
        System.out.println(Arrays.toString(evenodd(n)));
    }

    static int[] evenodd(int n){
        String s=Integer.toBinaryString(n);
        int even=0;
        int odd=0;
        for (int i=s.length()-1;i>=0;i--) {
            int index=s.length()-i-1;
            if(s.charAt(i)=='1'){
                if(index%2==0){
                    even++;
                }
                else {
                    odd++;
                }
            }
        }
        return new int[]{even,odd};
    }
}
