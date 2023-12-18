package Dsa;

public class Max_subarray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        MAx_subarray(arr);
    }
    static void MAx_subarray(int[] arr){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j <arr.length; j++) {
                int end=j;
                currSum=0;
                for (int k = start; k <=end ; k++) {
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);

    }


}
