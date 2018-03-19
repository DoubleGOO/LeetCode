package leetcode;

import java.util.Arrays;

//473. Matchsticks to Square
//https://leetcode.com/problems/matchsticks-to-square/description/
public class Solution_20170923_1 {
	public static boolean makesquare(int[] nums){
		if(nums == null || nums.length <4) return false;
		Arrays.sort(nums);
		reverse(nums);
		int sum = 0;
		for(int i:nums){
			sum += i;
		}
		if(sum%4 != 0)
			return false;
		
		return dfs(nums,new int[4],0,sum/4);
	}
	private static boolean dfs(int[] nums,int[] sums,int index,int target){
		if(index == nums.length){
			if(sums[0] == target && sums[1] == target && sums[2] == target)
				return true;
			return false;
		}
		
		for(int i = 0;i<4;i++){
			if(sums[i]+nums[index]>target){
				continue;
			}
			sums[i] += nums[index];
			if (dfs(nums, sums, index + 1, target)) return true;
    	    sums[i] -= nums[index];
		}
		return false;
	}
	private static void reverse(int[] nums){
		int i = 0;int j = nums.length-1;
		while(i<j){
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j++;
		}
	}
}
