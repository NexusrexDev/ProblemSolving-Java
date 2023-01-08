/**
 * Problem name: Best Time to Buy and Sell Stock
 * Problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 */

package LeetCode;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buyDay = 0, sellDay = prices.length - 1;
        int minBuy = prices[buyDay], maxSell = prices[sellDay], profit = 0;

        if (prices.length == 1)
            return 0;

        for (int i = 1; i < prices.length; i++) {
            //If the current price is cheaper than the buying price, change the value and pointer
            if (prices[i] < minBuy) {
                minBuy = prices[i];
                buyDay = i;
            }
            //You cannot sell on the day before the buying one
            if (prices[i] > maxSell || buyDay > sellDay) {
                maxSell = prices[i];
                sellDay = i;
            }
            profit = Math.max(profit, maxSell - minBuy);
        }

        if (profit < 1)
            return 0;
        else
            return profit;
    }
}