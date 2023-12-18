package Recursion;

public class Searchinarotatedsortedarray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=8;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        //if it is found in the left part

        if(arr[start]<arr[mid]){
            if(target>=arr[start] && target<arr[mid]){
                return search(arr,target,start,mid-1);
            }
            else {
                return search(arr,target,mid+1,end);
            }
        }

        //if it is found in the right part

        else if (arr[mid]<arr[end]) {
            if(target>arr[mid] && target<=arr[end]){
                return search(arr,target,mid+1,end);
            }
            else {
                return search(arr,target,start,mid-1);
            }

        }
        return -1;
    }
}