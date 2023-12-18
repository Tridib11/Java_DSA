package Dsa;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class Missing_Numbers {
    public static void main(String[] args) {
        int[] arr={4,0,2,1};
        int n=cyclic_sort(arr);
        System.out.println(n);
    }
    static int cyclic_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i];
            if (arr[i]<arr.length && arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }
        //searcing for the value
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index)
            {
                return index;
            }
        }
        return arr.length;

    }
    static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
