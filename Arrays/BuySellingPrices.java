public class BuySellingPrices {

    public static int BuySelling(int prices[]) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyingPrice < prices[i]) { // profit

                int profit = prices[i] - buyingPrice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyingPrice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 2, 5, 7, 4, 8, 5, 3, 8, 8 };
        System.out.println(BuySelling(prices));
    }

}
