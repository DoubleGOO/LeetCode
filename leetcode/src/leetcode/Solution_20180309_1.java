package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//18. 4Sum
//https://leetcode.com/problems/4sum/description/
public class Solution_20180309_1 {
	public static List<List<Integer>> fourSum(int[] nums,int target){
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for(int i = 0;i<nums.length - 3;i++){
			if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)break; //first candidate too large, search finished
	        if(nums[i]+nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]<target)continue; //first candidate too small
			if(i>0&&nums[i]==nums[i-1])continue;
			for(int j = i+1;j<nums.length - 2;j++){
				if(j>i+1&&nums[j]==nums[j-1])continue;
				int left = j+1;
				int right = nums.length-1;
				while(left<right){
					int sum = nums[i]+nums[j]+nums[left]+nums[right];
					if(sum < target)
						left++;
					else if(sum > target)
						right--;
					else{
						List<Integer> temp = new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[left]);
						temp.add(nums[right]);
						result.add(temp);
						while(left<right&&nums[left]==nums[++left]);
						while(left<right&&nums[right]==nums[--right]);
					}
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int nums[] = {1,0,-1,0,-2,2};
		fourSum(nums,0);
	}
}
