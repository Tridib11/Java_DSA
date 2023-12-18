package Dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,23,45,77,90};
        int target=100;
        System.out.println(binary(arr,target));

    }
    static int binary(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (target<arr[mid]) {
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
        }
        return -1;
    }
}
