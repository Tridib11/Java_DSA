public class minrsa {
    public static void main(String[] args) {
        int[] arr={1};
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if  (arr[start] <= arr[end]) {
                return arr[start];
            }
            else if(arr[start]==arr[mid] && arr[mid]==arr[end])
            {
                if(start<end && arr[start]>arr[start+1])
                {
                    return arr[start+1];
                }
                start++;
                if(end>start && arr[end]<arr[end-1]){
                    return arr[end];
                }
                end--;
            }

             else if(mid<end && arr[mid]>arr[mid+1])
            {
                return arr[mid+1];
            }
            else if(mid>start && arr[mid]<arr[mid-1])
            {
                return arr[mid];
            } else if (arr[start]<=arr[mid]) {
                start=mid+1;
            }
            else if(arr[mid]<=arr[end]) {
                end=mid-1;
            }
        }
        return -1;

    }
}