package Recursion;

import java.util.ArrayList;

public class returnarraylist {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,4,5};
//        ArrayList<Integer> ans=findAllIndex(arr,4,0,new ArrayList<>());
        //sout(ans);
        //or
        ArrayList<Integer> list= new ArrayList<>();
        findAllIndex(arr,4,0,list);
        System.out.println(list);
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}
