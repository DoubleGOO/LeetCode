package leetcode;
//18. 4Sum
//https://leetcode.com/problems/4sum/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_20180201_1 {
	//two pointer  降低一次方的复杂度，同理可应用至3sum 5sum 。。。。。
	public static List<List<Integer>> fourSum(int[] nums,int target){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int left = 0;
		int right = 0;
		for(int i = 0;i < nums.length - 3;i++){
			if(i > 0 && nums[i] == nums[i-1]){
				continue;
			}
			for(int j = i + 1;j < nums.length - 2;j++){
				if(j>i+1&&nums[j]==nums[j-1])
					continue;
				left = j+1;
				right = nums.length - 1;
				while(left<right){
					if(nums[i]+nums[j]+nums[left]+nums[right]<target){
						left++;
						while(nums[left]==nums[left-1]&&left<right){
							left++;
						}
					}
					else if(nums[i]+nums[j]+nums[left]+nums[right]>target){
						right--;
						while(nums[right]==nums[right+1]&&left<right){
							right--;
						}
					}
					else if(nums[i]+nums[j]+nums[left]+nums[right]==target){
						ArrayList<Integer> al = new ArrayList<>();
						al.add(nums[i]);
						al.add(nums[j]);
						al.add(nums[left]);
						al.add(nums[right]);
						result.add(al);
						left++;
						while(nums[left]==nums[left-1]&&left<right){
							left++;
						}
						right--;
						while(nums[left]==nums[left-1]&&left<right){
							right--;
						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2,2};
		System.out.println(fourSum(nums,0));
	}
}
