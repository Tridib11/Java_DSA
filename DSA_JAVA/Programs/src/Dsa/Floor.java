package Dsa;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class Floor {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=22;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr,int target)
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
        return end;
    }
}
