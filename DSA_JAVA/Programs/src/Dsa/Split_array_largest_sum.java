package Dsa;

import java.util.Scanner;

//https://leetcode.com/problems/split-array-largest-sum/
public class Split_array_largest_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int m = scn.nextInt();

        int ans = splitArray(arr, m);
        System.out.println(ans);

    }
    public static int splitArray(int[] nums, int k) {
        int max=0;
        int sum=0;
        for(int val:nums){
            sum+=val;
            max=Math.max(val,max);
        }
        if(k==nums.length){
            return max;
        }
        int lo=max;
        int hi=sum;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(nums,mid,k)==true)
            {
                ans=mid;
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
        return 0;
    }

    static boolean isPossible(int[] nums, int mid, int k) {
        int sa=1;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum>mid){
                sa++;
                sum=nums[i];
            }
        }
        return sa<=k;
    }
}
