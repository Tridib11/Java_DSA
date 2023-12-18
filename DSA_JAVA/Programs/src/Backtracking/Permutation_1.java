package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation_1 {
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
        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    static void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
//            permutationCount++; // Increment the counter for each permutation
            return;
        }

        for (int num : nums) {
            //skip if we ge the same element
            if (tempList.contains(num)) continue;
            //add new element
            tempList.add(num);
            //Go back to try other element
            backtrack(resultList, tempList, nums);
            //Remove the element
            tempList.remove(tempList.size() - 1);
        }
    }
}
