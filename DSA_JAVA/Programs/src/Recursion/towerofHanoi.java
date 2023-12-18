package Recursion;

public class towerofHanoi {
    public static void main(String[] args) {
        toh(3,10,11,12);
    }
    static void toh(int n,int t1id,int t2id,int t3id){
        if(n==0){
            return;
        }
        toh(n-1,t1id,t3id,t2id);
        System.out.println(n+"["+t1id+" -> "+t2id+"]");
        toh(n-1,t3id,t2id,t1id);
    }
}



//GFG

//https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1

//class Hanoi {
//    long count=0;
//    public long toh(int N, int from, int to, int aux) {
//
//
//        if(N>0){
//
//            toh(N-1, from, aux, to );
//            System.out.println("move disk "+ N + " from rod "+ from + " to rod " + to );
//            count++;
//            toh(N-1, aux, to, from);
//
//        }
//        return count;
//    }
//
//}
