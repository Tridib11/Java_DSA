package Recursion;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/merge-sort/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

//Time = O(nlogn)
//Space = O(n)
//depth-first

public class Mergesort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    static void merge(int[] arr,int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int i =start;
        int j=mid+1;
        int k=0;
        while(i<=mid &&j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements in the first sorted array
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //for leftover elements in the second sorted array
        while(j<=end){
            temp[k++]=arr[j++];
        }

        for(k=0,i=start;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
}
