package Dsa;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=4;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target)
    {
//        if(target>arr[arr.length-1])
//        {
//            return -1;
//        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (target<arr[mid]) {
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
        }
        return start;
    }
}
