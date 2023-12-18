public class minimuminarotatedsortedarray {
    public static void main(String[] args) {

    }

    static int searchmin(int[] arr){
        int start=0;
        int end=arr.length-1;
        if(arr[start]<=arr[end]){
            return arr[start];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return arr[mid+1];
            } else if (mid>start && arr[mid]<arr[mid-1]) {
                return arr[mid];
            } else if (arr[start]<=arr[mid]) {
                start=mid+1;
            } else if (arr[mid]<=arr[end]) {
                end=mid-1;
            }
        }
        return -1;
    }
}
