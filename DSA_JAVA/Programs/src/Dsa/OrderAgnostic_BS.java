package Dsa;

public class OrderAgnostic_BS {
    public static void main(String[] args) {
        int[] arr={90,77,45,23,3,1};
        int target=00;
        if(arr[0]<arr[arr.length-1]){
            System.out.println(ascen(arr,target));
        }
        else{
            System.out.println(descen(arr,target));
        }
    }

    static int ascen(int[] arr,int target)
    {
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
        return -1;
    }
    static int descen(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (target<arr[mid]) {
                start=mid+1;
            } else if (target>arr[mid]) {
                end=mid-1;
            }
        }
        return -1;
    }

}
