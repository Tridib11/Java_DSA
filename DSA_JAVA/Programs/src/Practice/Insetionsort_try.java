import java.util.Arrays;

public class Insetionsort_try {
    public static void main(String[] args) {
        int[] arr={2,1,4,3,0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertion(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }

            }

        }
    }
    static  void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
