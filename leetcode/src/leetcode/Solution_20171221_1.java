package leetcode;

import java.util.Arrays;

public class Solution_20171221_1 {
	public static int findMaxForm(String[] strs, int m, int n) {
		int[][] dp = new int[m+1][n+1];
		for(int i = 0;i<dp.length;i++){
			Arrays.fill(dp[i], 0);
		}
		for(String s : strs){
			int zeros = 0, ones = 0;
			for(char c:s.toCharArray()){ 
				int temp = (c=='0') ? zeros++ : ones++;
			}
			for(int i = m;i>=zeros;i--){
				for(int j = n;j>=ones;j--){
					dp[i][j] = Math.max(dp[i][j], dp[i-zeros][j-ones]+1);
				}
			}
		}
		return dp[m][n];
    }
	public static void main(String[] args) {
		String[] strs = {"0","00","1"};
		System.out.println(findMaxForm(strs,1,0));
	}
}
