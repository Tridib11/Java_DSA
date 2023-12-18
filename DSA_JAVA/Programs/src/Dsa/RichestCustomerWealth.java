package Dsa;
//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public static void main(String[] args) {

    }
    static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum+=accounts[person][account];
                
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return  ans;
    }

}
