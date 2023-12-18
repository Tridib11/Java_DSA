package Dsa;

public class findsingleelement {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,8,8};
        System.out.println(find(arr));

    }
    static int find(int[] arr){
        int start=0;
        int end=arr.length-1;
        int length=arr.length;
        if(length==1){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[length-1]!=arr[length-2]){
            return arr[length-1];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            } else if (arr[mid]==arr[mid-1]) {
                int lc=mid-start+1;
                if(lc%2==0){
                    start=mid+1;
                }
                else {
                    end=mid-2;
                }
            } else if (arr[mid]==arr[mid+1]) {
                int rc=end-mid+1;
                if(rc%2==0){
                    end=mid-1;
                }else {
                    start=mid+2;
                }

            }
        }
        return -1;
    }
}
