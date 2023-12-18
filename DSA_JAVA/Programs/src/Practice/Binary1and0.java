package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Binary1and0 {
    public static void main(String[] args) {
        int[] arr={0,1,0,0,0,0,1,1,1};
        binary_new(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void binary(int[] arr){
        int start=0,end=arr.length-1;
        if(arr.length%2==0){
            while (start<end){
                if(arr[start] <= arr[end]){
                    start++;
                    end--;
                } else {
                    swap(arr,start,end);
                }
            }
        }
        else{
            while(start<end){
                if(arr[start] <= arr[end]){
                    start++;
                } else {
                    swap(arr,start,end);
                    end--;
                    start++;
                }
            }
        }
    }

    static void binary_new(int[] arr){
        int start=0,end=arr.length-1;
        while (start<end){
            // move start pointer until it finds a 1
            while (start<end && arr[start]==1){
                start++;
            }
            // move end pointer until it finds a 0
            while (start<end && arr[end]==0){
                end--;
            }
            // swap the elements if they are out of order
            if (start<end && arr[start]<arr[end]){
                swap(arr,start,end);
            }
        }
    }


    static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
