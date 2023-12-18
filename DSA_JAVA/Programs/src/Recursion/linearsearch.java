package Recursion;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        System.out.println(linearsearch(arr,9,0));
    }

    static boolean linearsearch(int arr[],int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target|| linearsearch(arr,target,index+1);
    }
}
