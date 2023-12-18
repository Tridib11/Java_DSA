package Recursion;

public class firstoccurence {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,5,8,9};
        System.out.println(fo(arr,5,0));
    }
    static int fo(int[] arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fo(arr,key,i+1);
    }
}
