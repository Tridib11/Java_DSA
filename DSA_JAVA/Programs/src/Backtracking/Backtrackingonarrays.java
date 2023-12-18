package Backtracking;

public class Backtrackingonarrays {
    public static void main(String[] args) {
        int[] arr=new int[5];
        numbered_arrays(arr,0,1);
        printarr(arr);
    }
//Time complexity is n becuase ekbar opere jache n r ekbar niche asche n so 2n tou n
    static void numbered_arrays(int[] arr,int i,int val){
        //base case
        if(i==arr.length){
            printarr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        numbered_arrays(arr,i+1,val+1);
        arr[i]=arr[i]-2;

    }
    static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
