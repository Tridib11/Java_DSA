package Dsa;

import java.util.ArrayList;
import java.util.List;

public class Find_all_the_duplicates_in_the_array {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i]-1;
            if (arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }

        return ans;


    }

    static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
