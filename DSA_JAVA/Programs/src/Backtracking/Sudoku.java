//package Backtracking;
//
//public class Sudoku {
//    public static void main(String[] args) {
//
//    }
//    static void solveSudoku(int[][] board ,int i,int j){
//        if(i==board.length){
//            display(board);
//            return;
//        }
//        int ni=0;
//        int nj=0;
//        if(j==board[0].length-1){
//            ni=i+1;
//            nj=0;
//        }else{
//            ni=i;
//            nj=j+1;
//        }
//        if(board[i][j]!=0){
//            solveSudoku(board,ni,nj);
//        }
//        else{
//            for (int po = 1; po <=9 ; po++) {
//                if(isValid(board,i,j,po)==true){
//                  board[i][j]=po;
//                  solveSudoku(board, ni, nj);
//                  board[i][j]=0;
//                }
//            }
//        }
//    }
//    static boolean isValid(int[][] board,int x,int y,int val){
//        for (int i = 0; i < board[0].length; i++) {
//            if(board[x][i]==val){
//                return false;
//            }
//        }
//        for (int j = 0; j < board.length; j++) {
//            if(board[j][y]==val){
//                return false;
//            }
//
//        }
//        int smi=x/3*3;
//        int smj=y/3*3;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if(board[smi+i][smj+j]==val){
//                    return false;
//                }
//
//            }
//
//        }
//        return true;
//    }
//}
