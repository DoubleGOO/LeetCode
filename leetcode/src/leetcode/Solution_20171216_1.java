package leetcode;
//650. 2 Keys Keyboard
//https://leetcode.com/problems/2-keys-keyboard/description/
public class Solution_20171216_1 {
	public int minSteps(int n) {
		if(n<2) return 0;
        int[] dp = new int[n+1];
        dp[1] = 0;
        for(int i = 2;i<=n;i++){
        	dp[i] = i;
        }
        for(int i=2;i<=n;i++){
        	for(int j=i/2;j>=2;j--){
        		if(i%j==0){
        			dp[i] = Math.min(dp[i],dp[j]+i/j);
        			break;
        		}
        	}
        }
        return dp[n];
    }
	/***非常精简的动态规划版***/
//	public int minSteps(int n) {
//        int res = 0;
//        for (int i = 2; i <= n; i++) {
//            while (n % i == 0) { // 代表copy某个数i次，所以res += i
//                res += i;
//                n = n / i;
//            }
//        }
//        return res;
//    }
	public static void main(String[] args) {
		
	}
}
