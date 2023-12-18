import java.util.Arrays;

public class missingnumber {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        int n=find(arr);
        System.out.println(n);
    }
    static int find(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
