package com.practice.stream.interview.others;

public class MaximumProfit {
	// Wissen Technology

	public static void main(String[] args) {
		int[] stockPrices = new int[] { 7, 1, 5, 3, 6, 4 };
		int maxProfit = getMaxProfit(stockPrices);
		System.out.println("Max profit is : " + maxProfit);
	}

	// Scenario 1: O(n^2)
//	static int getMaxProfit(int[] stockPrices) {
//
//		int maxProfit = 0;
//		for (int i = 0; i < stockPrices.length; i++) {
//			int j = stockPrices.length - 1;
//			while (i < j) {
//				int dayProfit = stockPrices[j] - stockPrices[i];
//				if (dayProfit > maxProfit) {
//					maxProfit = dayProfit;
//				}
//				j--;
//			}
//		}
//		return maxProfit;
//	}

	// Scenario 2:
	static int getMaxProfit(int[] stockPrices) {

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : stockPrices) {
			if (price < minPrice) {
				minPrice = price;
			} else {
				int profit = price - minPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}

		return maxProfit;
	}

}
