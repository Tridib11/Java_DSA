import java.util.Arrays;

public class reverseanarray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        System.out.println(Arrays.toString(reverse(arr)));

    }
    static int[] reverse(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

}
