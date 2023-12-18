package Backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class subset2 {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=subsetsWithDup(arr);
        for (List<Integer> list:ans) {
            System.out.println(list);
        }
    }
    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        subset2(0,nums,list,ans);
        return ans;
    }
    static void subset2(int ind, int[] arr, ArrayList<Integer> list, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            list.add(arr[i]);
            subset2(i+1,arr,list,ans);
            list.remove(list.size()-1);
        }
    }
}
