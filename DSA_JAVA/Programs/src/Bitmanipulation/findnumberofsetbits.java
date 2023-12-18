package Bitmanipulation;
//https://practice.geeksforgeeks.org/problems/set-bits0143/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
public class findnumberofsetbits {
    public static void main(String[] args) {

    }
    static int setBits(int n) {
        // code here
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
