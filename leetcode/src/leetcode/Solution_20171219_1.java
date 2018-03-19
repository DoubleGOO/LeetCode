package leetcode;
//198. House Robber
//https://leetcode.com/problems/house-robber/description/
public class Solution_20171219_1 {
	public int rob(int[] nums){
		if(nums.length == 0)return 0;
		int[] dp = new int[nums.length];
		for(int i = 0;i < nums.length;i++){
			dp[i] = nums[i];
		}
		if(nums.length>1){
			dp[1] = Math.max(nums[0], nums[1]);
		}
		for(int i = 2;i<nums.length;i++){
			dp[i] = Math.max(dp[i-2]+dp[i], dp[i-1]);
		}
		return dp[nums.length-1];
	}
	public static void main(String[] args) {
		
	}
}
