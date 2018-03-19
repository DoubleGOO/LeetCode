package leetcode;
//Best Time to Buy and Sell Stock I\II
public class Solution_20180203_1 {
	public static int maxProfitI(int[] prices) {
		int result = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<prices.length;i++){
			if(prices[i]-min>result){
				result = prices[i]-min;
			}else if(prices[i]-min<0){
				min = prices[i];
			}
		}
		return result;
    }
	public static int maxProfitII(int[] prices) {
		int result = 0;
		for(int i = 1;i<prices.length;i++){
			result+=Math.max(0, prices[i]-prices[i-1]);
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {7,6,5,4,4,4};
		System.out.println(maxProfitI(prices));
	}

}
