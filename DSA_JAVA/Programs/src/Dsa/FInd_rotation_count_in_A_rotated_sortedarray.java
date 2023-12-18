package Dsa;

import java.util.*;


public class FInd_rotation_count_in_A_rotated_sortedarray {
    public static void main(String[] args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = rotationcount(arr);
        System.out.println(ans);

    }

    static int rotationcount(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;
        if (nums[start] <= nums[end]) {
            return start;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else if (nums[mid] <= nums[end]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
