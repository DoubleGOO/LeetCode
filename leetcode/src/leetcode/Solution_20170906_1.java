package leetcode;
//Best Time to Buy and Sell Stock
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class Solution_20170906_1 {
	public static int maxProfit(int[] prices){
		int max = 0;
		if(prices.length>1){
			int min = prices[0];
			for(int i = 1;i<prices.length;i++){
				if(prices[i]-min > max)
					max = prices[i] - min;
				if(prices[i]-min < 0){
					min = prices[i];
				}
			}
		}
		return max;
	}
	public static void main(String[] args){
		int[] prices = {1,7,4,11};
		System.out.println(maxProfit(prices));
	}
}
