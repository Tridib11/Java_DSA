package Dsa;

public class MaxSubarray_Kadanes {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        max(arr);

    }
    static void max(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int currentsum=0;
        for (int i = 0; i < arr.length; i++) {
            currentsum=Math.max(currentsum+arr[i],arr[i]);
            maxSum=Math.max(currentsum,maxSum);

        }
        System.out.println(maxSum);
    }
}
