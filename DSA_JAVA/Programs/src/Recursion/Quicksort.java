package Recursion;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr={7,2,9,3,1,4};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int arr[],int low_index,int high_index){
        if(low_index>=high_index){
            return;
        }
        int pivot=arr[high_index];
        int left_pointer=low_index;
        int right_pointer=high_index;
        while(left_pointer<right_pointer){
            while(arr[left_pointer]<=pivot && left_pointer<right_pointer){
                left_pointer++;
            }
            while(arr[right_pointer]>=pivot && left_pointer<right_pointer){
                right_pointer--;
            }
            swap(arr,left_pointer,right_pointer);
        }
        swap(arr,left_pointer,high_index);

        quicksort(arr,low_index,left_pointer-1);
        quicksort(arr,left_pointer+1,high_index);
    }
    static void swap(int[] arr,int lp,int rp){
        int temp=arr[lp];
        arr[lp]=arr[rp];
        arr[rp]=temp;
    }
}
