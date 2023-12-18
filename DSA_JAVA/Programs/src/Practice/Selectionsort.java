import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr={2,1,5,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,lastIndex);
            swapIndex(arr,maxIndex,lastIndex);
        }
    }

    static void swapIndex(int[] arr, int maxIndex, int lastIndex) {
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[lastIndex];
        arr[lastIndex]=temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for (int i = start+1; i <=end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
