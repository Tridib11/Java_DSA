package Dsa;

public class Search_In_an_Infinite_Sroted_Array {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int ans = infiarray(arr, 130);
        System.out.println("Element found at index " + ans);
    }
    static int search(int[] arr,int target,int start,int end)
    {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    static int infiarray(int[] arr,int target)
    {
        int low=0;
        int high=1;
        while(target>arr[high]){
            low=high;
            high=2*high;
        }
        return search(arr,target,low,high);
    }
}
