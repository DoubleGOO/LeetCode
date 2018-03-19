package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//646. Maximum Length of Pair Chain
//https://leetcode.com/problems/maximum-length-of-pair-chain/description/
public class Solution_20171217_1 {
	/****greedy*****/
	public static int findLongestChain(int[][] pairs) {
		if(pairs.length<1)return 0;
        Arrays.sort(pairs, new myComparator());
        int result = 1;
        int end = pairs[0][1];
        for(int i = 1;i<pairs.length;i++){
        	if(pairs[i][0]>end){
        		result++;
        		end = pairs[i][1];
        	}
        }
        return result;
    }
	public static class myComparator implements Comparator<int []>{
		public int compare(int[] a,int[] b){
			return a[1] - b[1];
		}
	}
	/*****dp******/
	public int findLongestChain_dp(int[][] pairs) {
        if (pairs == null || pairs.length == 0) return 0;
        Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], pairs[i][0] > pairs[j][1]? dp[j] + 1 : dp[j]);
            }
        }
        return dp[pairs.length - 1];
    }
	public static void main(String[] args) {
		int[][] pairs={{2,4},{2,3},{1,2}};
		Arrays.sort(pairs, new myComparator());
	}
}
