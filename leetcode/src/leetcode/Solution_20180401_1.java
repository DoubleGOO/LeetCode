package leetcode;
//53. Maximum Subarray
//https://leetcode.com/problems/maximum-subarray/description/
public class Solution_20180401_1 {
	public static int maxSubArray(int[] nums) {
		int max = nums[0];
		int sum = nums[0];
        for(int i = 1;i<nums.length;i++){
        	if(sum > 0)
        		sum = sum + nums[i];
        	else
        		sum = nums[i];
        	max = (sum>max?sum:max);
        }
        return max;
    }
	
//	public int maxSubArray(int[] nums)  {
//        int[] dp = new int[nums.length];
//        for(int i = 0;i<nums.length;i++){
//        	dp[i] = nums[i];
//        }
//        int max = nums[0];
//        for(int i = 1;i<dp.length;i++){
//        	dp[i] = Math.max(dp[i], dp[i]+dp[i-1]);
//        	max = Math.max(dp[i], max);
//        }
//        return max;
//    }
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
}
