import java.util.Arrays;
public class csort {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        int[]ans=sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(j+1!=arr[j]){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
