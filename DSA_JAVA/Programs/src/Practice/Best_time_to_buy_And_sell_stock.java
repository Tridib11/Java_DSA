public class Best_time_to_buy_And_sell_stock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(buy_And_Sell(arr));

    }

    static int buy_And_Sell(int[] arr)
    {
        int buyingprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i = 0; i < arr.length; i++) {
            if(buyingprice<arr[i]){
                int profit=arr[i]-buyingprice;
                maxprofit=Math.max(profit,maxprofit);
            }
            else {
                buyingprice=arr[i];
            }

        }
        return maxprofit;
    }
}
