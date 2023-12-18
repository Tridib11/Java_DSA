package Dsa;

import java.util.*;

public class Searchina2Dmatrix
{

    /*your task is to complete this function which returns true if target exists in the matrix
    else return false*/
    public static boolean search(int[][]matrix,int target) {
        int r=binarySearchRowSelect(matrix,target);
        if(r==-1)
        {
            return false;
        }
        boolean isFound=binarySearch(matrix,r,target);

        return false;
    }

    public static boolean binarySearch(int[][] matrix, int r, int target) {
        int lo=0;
        int hi=matrix[0].length-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(matrix[r][mid]==target)
            {
                return true;
            } else if (matrix[r][mid]<target) {
                lo=mid+1;
            }
            else {
                hi=mid-1;
            }
        }
        return false;

    }

    public static int binarySearchRowSelect(int[][] matrix, int target) {
        int lo=0;
        int high=matrix.length-1;
        int lc=matrix[0].length-1;
        while(lo<=high)
        {
            int mid=(lo+high)/2;
            if(matrix[mid][0]<=target && target <=matrix[mid][lc])
            {
                return mid;
            } else if (matrix[mid][0]<target) {
                lo=mid+1;
            } else if (matrix[mid][0]>target) {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][]matrix = new int[m][n];

        for(int i=0; i < m;i++) {
            for(int j=0; j < n;j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        int target = scn.nextInt();

        boolean isFound = search(matrix,target);
        System.out.println(isFound);

    }
}