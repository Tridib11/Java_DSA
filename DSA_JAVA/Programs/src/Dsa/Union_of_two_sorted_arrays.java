package Dsa;
//https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

import java.util.*;
import java.io.*;

public class Union_of_two_sorted_arrays {

    /*You have to complete union function and return an Arraylist which contains union elements of the two arrays*/
    public static ArrayList<Integer> union(int[] arr1,int[] arr2) {
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                if(list.size()>0 && list.get(list.size()-1)!=arr1[i])
                {
                    list.add(arr1[i]);
                }
                else if(list.size()==0){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                if(list.size()>0 && list.get(list.size()-1)!=arr1[i])
                {
                    list.add(arr1[i]);
                }
                else if(list.size()==0){
                    list.add(arr1[i]);
                }
                i++;
            }
            else
            {
                if(list.size()>0 && list.get(list.size()-1)!=arr2[j])
                {
                    list.add(arr2[j]);
                }
                else if(list.size()==0){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<arr1.length)
        {
            if(list.get(list.size()-1)!=arr1[i])
            {
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length)
        {
            if(list.get(list.size()-1)!=arr2[j])
            {
                list.add(arr2[j]);
            }
            j++;
        }


        return list;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        //input work
        int n = scn.nextInt();
        int[]a = new int[n];
        for(int i=0; i < n;i++) {
            a[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[]b = new int[m];
        for(int i=0;i < m;i++) {
            b[i] = scn.nextInt();
        }

        ArrayList<Integer>ans = union(a,b);

        //print answer list
        for(int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}