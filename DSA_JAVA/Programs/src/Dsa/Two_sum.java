package Dsa;

import java.util.Arrays;
//https://leetcode.com/problems/two-sum/
public class Two_sum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(arr,target)));    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr={-1,-1};
        for (int i = 0; i <= nums.length-1;i++) {
            for (int j = i+1; j <=nums.length-1 ; j++) {
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;

    }
}
//same way

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++)
//            {
//                if(nums[i]+nums[j]==target)
//                {
//                    return new int[] {i,j} ;
//                }
//
//            }
//
//        }
//        return new int[] {-1,-1};
//    }
//}