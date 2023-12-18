package Dsa;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={23,45,1,2,8,19,-3,11};
        int target=19;
        System.out.println(linearSearch(nums,target));
    }
    //search in the array
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //check for element at everyindex
            int element=arr[i];
            if(element==target)
            {
                return i;
            }
        }
        //hence no target found
        return -1;

    }
}
