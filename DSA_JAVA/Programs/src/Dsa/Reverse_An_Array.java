package Dsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverse_An_Array {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
   }
}
