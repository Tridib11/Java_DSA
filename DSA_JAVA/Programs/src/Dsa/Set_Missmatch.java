package Dsa;

public class Set_Missmatch {
    public static void main(String[] args) {

    }
    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i]-1;
            if (arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }
        //searcing for the value
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1)
            {
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
