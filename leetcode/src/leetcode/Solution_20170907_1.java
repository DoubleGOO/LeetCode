package leetcode;

import java.util.Arrays;

//35. Search Insert Position
//https://leetcode.com/problems/search-insert-position/description/
public class Solution_20170907_1 {
	public static int searchInsert(int[] nums,int target){
		int i;
		if(target<nums[0]) return 0;
		for(i = 0;i<nums.length;i++){
			if(target==nums[i]) return i;
			if(target>nums[i]&&(i+1)<nums.length&&target<nums[i+1]) return i+1;
		}
		return i;
	}
	public static int searchInsert_standar(int[] nums,int target){
		int key = Arrays.binarySearch(nums, target);
		if(key < 0) key = -(key+1);
		return key;
	}
	public static void main(String[] args){
		int[] nums = {1};
		System.out.println(searchInsert(nums,2));
	}
}
