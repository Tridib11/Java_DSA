package Backtracking;
//condition only right and down
//time complexity=2^(m+n) exponential

//for linear time complexity use
//formula = (n-1+m-1)!/(n-1)!(m-1)!
//time complexity=O(n+m)

public class Gridways {
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWays(0,0,m,n));
    }

    static int gridWays(int i,int j,int m,int n){
        //base case
        if(i==m-1 & j==n-1){
            return 1;
        }
        //condition for the last cell
        else if(i==m||j==n){
                return 0;
            }

        int way1=gridWays(i+1,j,m,n);
        int way2=gridWays(i,j+1,m,n);
        return way1+way2;
    }
}
