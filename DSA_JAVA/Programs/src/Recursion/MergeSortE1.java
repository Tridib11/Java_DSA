package Recursion;

import java.util.Arrays;

public class MergeSortE1 {
    public static void main(String[] args) {

        //https://leetcode.com/problems/sort-an-array/


    }

    public int[] sortArray(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=sortArray(Arrays.copyOfRange(arr,0,mid));
        int[] right=sortArray(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(right,left);
    }
    static int[] merge(int[] first, int[] second) {
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
