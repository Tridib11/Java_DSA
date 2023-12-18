import java.util.Scanner;

public class allocateminimumnumberofpages {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int m = scn.nextInt();

        int ans = minPages(arr, m);
        System.out.println(ans);

    }
    static int minPages(int[] arr,int m){
        int sum=0;
        int max=0;
        for(int val:arr){
            sum+=val;
            max=Math.max(max,val);
        }
        if(m==arr.length){
            return max;
        }
        if(m>arr.length){
            return -1;
        }
        int start=max;
        int end=sum;
        int ans=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(arr,mid,m)==true){
                ans=mid;
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] arr, int mid, int m) {
        int student=1;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum>mid){
                student++;
                sum=arr[i];
            }

        }
        return student<=m;
    }


}

