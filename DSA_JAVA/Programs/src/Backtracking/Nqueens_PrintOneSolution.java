package Backtracking;
//Nqueens_PrintOneSolution
//Time complexity O(n!)
public class Nqueens_PrintOneSolution {
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)  {
                board[i][j]='x';
            }
        }
        if(nqueens(board,0)) System.out.println("Solution is possible"); else System.out.println("Solution is not possible");
        printBoard(board);
//        System.out.println("Total ways to print "+n+" queens are "+count );
    }
    static int count=0;
    static boolean nqueens(char board[][],int row){
        if(row== board.length){
            //printBoard(board);
            count++;
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nqueens(board,row+1)){
                    return true;
                }
                board[row][j]='x';
            }
        }
        return false;
    }
    static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for (int i = row-1; i >=0 ; i--) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for (int i = row-1,j=col-1; i>=0 && j>=0 ; i--,j--) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    static void printBoard(char board[][]){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }
}


