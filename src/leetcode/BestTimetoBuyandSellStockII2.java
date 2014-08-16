package leetcode;

public class BestTimetoBuyandSellStockII2 {
	public int maxProfit(int[] prices) {
		int maxprofit = 0;
		int i = 1;
		while (i < prices.length) {
			while (i < prices.length && prices[i] < prices[i - 1]) 
				i++;
			int buy = prices[i - 1];
			while (i < prices.length && prices[i] > prices[i - 1]) 
				i++;
			int sell = prices[i - 1];
			maxprofit += sell - buy;
			// don't forget this the price may be keep the same
			i++;
		}
		return maxprofit;
	}
}
