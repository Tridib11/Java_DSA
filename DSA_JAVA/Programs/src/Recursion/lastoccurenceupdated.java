package Recursion;

public class lastoccurenceupdated {
    public static void main(String[] args) {
        int[] arr={5,3,2,5,4,3,5,2};
        int key=5;
        System.out.println(last(arr,key,0));
    }
    static int last(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int found=last(arr,key,i+1);
        if(found==-1){
            if(arr[i]==key){
                return i;
            }
            else {
                return -1;
            }
        }
        return found;
    }
}
