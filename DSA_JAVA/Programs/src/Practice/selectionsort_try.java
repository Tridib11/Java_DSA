import java.util.Arrays;

public class selectionsort_try {
    public static void main(String[] args) {
        int[] arr={2,1,4,3,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxindex=getmaxindex(arr,0,last);
            swappostions(arr,maxindex,last);
        }
    }

    static void swappostions(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }

    static int getmaxindex(int[] arr,int start,int end)
    {
        int max=start;
        for (int i = start+1; i<=end; i++) {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}
