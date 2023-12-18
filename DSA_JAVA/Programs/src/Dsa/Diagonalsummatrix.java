package Dsa;
//https://leetcode.com/problems/matrix-diagonal-sum/description/
public class Diagonalsummatrix {
    public static void main(String[] args) {

    }
    public static int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            if(i!=n-i-1){
                sum+=mat[i][n-i-1];
            }
        }
        return sum;
    }
}

