package Dsa;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class Find_In_Mountain_Array {
    public static void main(String[] args) {

    }

//    public static int findInMountainArray(int target, MountainArray mountainArr) {
//
//    }9
    static int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firsttry=oabs_search(arr,target,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return oabs_search(arr,target,peak+1,arr.length-1);


    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int oabs_search(int[] arr,int target,int start,int end)
    {
//        int start=0;
//        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if (target<arr[mid]) {
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }else {
                if (target>arr[mid]) {
                    end=mid-1;
                } else {
                    start=mid+1;
                }

            }

        }
        return -1;

    }
}
