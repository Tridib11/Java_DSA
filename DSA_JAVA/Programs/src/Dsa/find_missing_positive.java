package Dsa;

public class find_missing_positive {
    public static void main(String[] args) {

    }

    static int number(int[] arr)
    {
        int i=0;
        int correct_index=arr[i]-1;
        if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct_index]){
            swap(arr,i,correct_index);
        }
        else {
            i++;
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                return index+1;
            }

        }
        return arr.length+1;
    }

    static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
