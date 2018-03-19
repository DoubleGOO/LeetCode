package leetcode;
//53. Maximum Subarray
//https://leetcode.com/problems/maximum-subarray/description/
public class Solution_20171220_2 {
	public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
        	dp[i] = nums[i];
        }
        int max = nums[0];
        for(int i = 1;i<dp.length;i++){
        	dp[i] = Math.max(dp[i], dp[i]+dp[i-1]);
        	max = Math.max(dp[i], max);
        }
        return max;
    }
	public static void main(String[] args) {
		
	}
}
 