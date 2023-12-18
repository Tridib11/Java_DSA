package Bitmanipulation;

import java.util.Arrays;

public class countingbits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));

    }
    static int[] countBits(int n){
        int arr[]=new int[n+1];
        int add=0;
        for (int i = 0; i <=n; i++) {
            add=find(i);
            arr[i]=add;
        }
        return arr;
    }
    static int find(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>>1;
        }
        return count;
    }
}
