package Dsa;
//https://leetcode.com/problems/remove-element/
public class Remove_Element {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
