public class searchina2Dmatrix {
    public static void main(String[] args) {
//        int[][] arr;
//        int target;
//        int rowfind=findrow(arr,target);
    }

    static boolean search(int[][] arr, int target){
        int row=findrow(arr,target);
        if(row==-1){
            return false;
        }
        boolean isfound=binarysearch(arr,row,target);
        return isfound;
    }

    static boolean binarysearch(int[][] arr, int row, int target) {
        int start=0;
        int end=arr[0].length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[row][mid]==target){
                return true;
            }
            else if(target<arr[row][mid]){
                end=mid-1;
            } else if (target>arr[row][mid]) {
                start=mid+1;
            }
        }
        return false;
    }
    static int findrow(int[][] arr,int target){
        int start=0;
        int end=arr.length-1;
        int li=arr[0].length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>=arr[mid][0] && target<=arr[mid][li]){
                return mid;
            } else if (arr[mid][0]<target) {
                start=mid+1;
            } else if (arr[mid][0]>target) {
                end=mid-1;
            }
        }
        return -1;
    }

}
