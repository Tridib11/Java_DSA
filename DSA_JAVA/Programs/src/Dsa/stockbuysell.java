package Dsa;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class stockbuysell {
    public static void main(String[] args) {
        int[] price={7,1,5,3,6,4};
        System.out.println(profit(price));
    }
    static int profit(int[] prices){
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
             if(buyprice < prices[i]){
                 int profit=prices[i]-buyprice;
                 maxProfit=Math.max(maxProfit,profit);
             }
             else {
                 buyprice=prices[i];
             }
        }
        return maxProfit;
    }
}
