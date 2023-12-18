package Dsa;

public class Mimimum_in_a_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr={2,2,2,0,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums[start] <= nums[end]) {
            return nums[start];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else if (nums[mid] <= nums[end]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
