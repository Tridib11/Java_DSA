package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = permute(arr);

        // Print the number of permutations
        System.out.println("Number of permutations: " + ans.size());

        // Print the permutations
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
//       er int permutationCount = 0; // Initialize a count
        backtrack(resultList, new ArrayList<>(), nums,new boolean[nums.length]);
        return resultList;
    }

    static void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums,boolean[] used) {
        if (tempList.size() == nums.length && !resultList.contains(tempList)) {
            resultList.add(new ArrayList<>(tempList));
//            permutationCount++; // Increment the counter for each permutation
            return;
        }
        for (int i =0;i<nums.length;i++) {
            //skip if we ge the same element
            if (used[i]) continue;
            //add new element
            used[i]=true;
            tempList.add(nums[i]);
            //Go back to try other element
            backtrack(resultList, tempList, nums,used);
            //Remove the element
            used[i]=false;
            tempList.remove(tempList.size() - 1);
        }
    }
}
