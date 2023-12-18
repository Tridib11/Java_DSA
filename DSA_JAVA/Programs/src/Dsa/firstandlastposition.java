package Dsa;

public class firstandlastposition {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] ans=search(arr,target);
    }

    static int[] search(int arr[],int target){
        int[] ans={-1,-1};
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans[0]=mid;
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
        }
        start=0;
        end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans[1]=mid;
                start=mid+1;
            } else if (arr[mid]<target) {
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
        }
        return ans;
    }
}
