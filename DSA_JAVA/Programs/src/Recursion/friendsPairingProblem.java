package Recursion;

public class friendsPairingProblem {
    public static void main(String[] args) {

    }

    static int pair(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1=pair(n-1);
        int fnm2=pair(n-2);
        int pairWays=(n-1)*fnm2;
        int totWays=fnm1+pairWays;
        return totWays;
    }
}
