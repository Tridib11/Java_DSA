package Dsa;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class Fist_and_last_position_in_array {
    public static void main(String[] args) {
        int[]nums = {7,7,8,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(find(nums,target)));
    }
    public static int[] find(int[] arr,int target){
      int[] ans={-1,-1};
      //search on the left side
      int start=0;
      int end=arr.length-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]==target){
              ans[0]=mid;
              end=mid-1;
          } else if (arr[mid]>target) {
              end=mid-1;
          } else if (arr[mid]<target) {
              start=mid+1;
          }
      }
      //search on the right side
        start=0;
        end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans[1]=mid;
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
        }
        return ans;
    }
}
