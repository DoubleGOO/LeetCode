package leetcode;
//70. Climbing Stairs
//https://leetcode.com/problems/climbing-stairs/description/
public class Solution_20171220_1 {
	public int climbStairs(int n) {
		int[] dp = new int[n];
		if(n<=2) return n;
		dp[0] = 1;
		dp[1] = 2;
		for(int i = 2;i<n;i++){
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n-1];
    }
	public static void main(String[] args) {
		
	}
}
