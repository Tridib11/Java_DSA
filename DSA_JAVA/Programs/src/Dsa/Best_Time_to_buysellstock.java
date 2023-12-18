package Dsa;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Best_Time_to_buysellstock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(buyandsellstocks(arr));

    }
    static int buyandsellstocks(int[] arr){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < arr.length; i++) {
            if(buyPrice<arr[i]){
                int profit=arr[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else {
                buyPrice=arr[i];
            }
        }
        return maxProfit;
    }



}
