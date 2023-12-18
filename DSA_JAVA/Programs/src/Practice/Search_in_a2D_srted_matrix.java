public class Search_in_a2D_srted_matrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,5,7,9},
                {10,20,25,29,34},
                {38,40,44,49,53},
                {60,61,65,68,74},
                {78,80,85,90,92}
        };
        boolean searchb=search(arr,53);
        System.out.println(searchb);
    }
    static boolean search(int[][] arr,int target)
    {
        int  r=row(arr,target);
        if(r==-1)
        {
            return false;
        }
        boolean is_found=binarysearch(arr,r,target);
        return is_found;
    }

    static boolean binarysearch(int[][] arr, int r, int target) {
        int start = 0;
        int end = arr[0].length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[r][mid] == target) {
                return true;
            } else if (arr[r][mid] < target) {
                start=mid+1;  // Adjust the end index
            } else {
                end=mid-1;  // Adjust the start index
            }
        }
        return false;
    }

    static int row(int[][] matrix,int target)
    {
        int start=0;
        int end=matrix.length-1;
        int lc=matrix[0].length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(matrix[mid][0]<=target && matrix[mid][lc]>=target)
            {
                return mid;
            } else if (matrix[mid][0]<target) {
                start=mid+1;
            }
            else if (matrix[mid][0]>target) {
                end=mid-1;
            }
        }
        return -1;
    }
}
