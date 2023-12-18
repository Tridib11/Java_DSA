package Dsa;

public class Mountainarray_peakindex {
    public static void main(String[] args) {

    }
    static int peakIndex(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
}
