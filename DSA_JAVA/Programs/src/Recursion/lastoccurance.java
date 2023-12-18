package Recursion;

public class lastoccurance {
    public static void main(String[] args) {
            int arr[]={5,5,5,3};
            int key=5;
        System.out.println(last(arr,key,0));
    }
    static int last(int[] arr,int key,int i){
        if(i==arr.length){
            return -1;

        }
        int isFound=last(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
}
