package leetcode;

/* Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 */
public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min)
				min = prices[i];
			int profit = prices[i] - min;
			if (profit > maxprofit)
				maxprofit = profit;
		}
		return maxprofit;
	}
}
