public class srsa {
    public static void main(String[] args) {
            int[] arr={2,2,8,2,2,2,2,2,2};
            int target=2;
            System.out.println(searchin_rotated(arr,target));
    }

    private static int searchin_rotated(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (arr[start]<=arr[mid]) {
                if(target>=arr[start] && target<arr[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if(target>arr[mid] && target<=arr[end])
                {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;

    }
}
