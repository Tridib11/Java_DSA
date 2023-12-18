package Backtracking;

//timecomplexity=(n*2^n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/subsets/description/
public class Subsetsiterativeway {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=subsets(arr);
        for (List<Integer> list:ans) {
            System.out.println(list);
        }
    }
    static List<List<Integer>> subsets(int[] arr){
//        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr) {
            int size=outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
