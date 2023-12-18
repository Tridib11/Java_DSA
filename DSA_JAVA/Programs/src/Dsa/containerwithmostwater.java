package Dsa;
//https://leetcode.com/problems/container-with-most-water/description/
public class containerwithmostwater {
    public static void main(String[] args) {

    }
    static int water(int[] height){
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int min_height=Math.min(height[right],height[left]);
            int current_area=min_height*(right-left);
            maxArea=Math.max(maxArea,current_area);
            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
