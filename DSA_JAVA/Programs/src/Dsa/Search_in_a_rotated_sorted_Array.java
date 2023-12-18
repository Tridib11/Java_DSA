package Dsa;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Search_in_a_rotated_sorted_Array {
    public static void main(String[] args) {
        int[] arr={3,1};
        int target=1;
        System.out.println(searchin_rotated(arr,target));
    }
    public static int searchin_rotated(int[] nums, int target)  {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;                
            }
            else if (nums[start]<=nums[mid]) {
                if (target>=nums[start] && nums[mid]>target) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else {
                if(target>nums[mid] && nums[end]>=target)
                {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
        

    }
}
