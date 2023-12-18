package Dsa;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class Movezeroes {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1};
        zeroes_to_toRight(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void zeroes_to_the_left(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        while(j<arr.length){
            arr[j++]=0;
        }
    }
    static void zeroes_to_toRight(int[] arr){
        int j=arr.length-1;
        for (int i = arr.length-1; i>0 ; i--) {
            if(arr[i]!=0){
                arr[j--]=arr[i];
            }
        }
        while(j>=0){
            arr[j--]=0;
        }
    }
}
