package Dsa;
//https://leetcode.com/problems/find-the-duplicate-number/
public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        int n= Duplicate_Number(arr);
        System.out.println(n);

    }
    public static int Duplicate_Number(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]!=i+1)
            {
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct])
                {
                    swap(arr,i,correct);
                }
                else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;

    }
    static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }


}
