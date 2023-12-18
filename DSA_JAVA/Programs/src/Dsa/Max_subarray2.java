package Dsa;

public class Max_subarray2
{
    public static void main(String[] args) {
        int[] arr={-2,-4,-8,-10};
        max(arr);

    }
    static void max(int[] arr)
    {
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int curentsum=0;
            for (int j = i; j < arr.length; j++) {
                curentsum+=arr[j];
                if(curentsum>maxsum){
                    maxsum=curentsum;
                }
            }

        }
        System.out.println(maxsum);
    }

}
