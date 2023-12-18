package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_2 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/subsets-ii/description/
    }

    static List<List<Integer>> subsetsWithDuplicates(int[] nums){
        List<List<Integer>> resultList=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resultList,new ArrayList<>(),nums,0);
        return resultList;
    }

    static void backtrack(List<List<Integer>> resultsList,List<Integer> tempSet,int[] nums,int start){
        if(resultsList.contains(tempSet)){
            return;
        }
        resultsList.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++){
            tempSet.add(nums[i]);
            backtrack(resultsList,tempSet,nums,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
}
