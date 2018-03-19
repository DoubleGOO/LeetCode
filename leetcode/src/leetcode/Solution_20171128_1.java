package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//15. 3Sum
//https://leetcode.com/problems/3sum/description/
public class Solution_20171128_1 {
	public static List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> value = new ArrayList<>();
		HashSet<List<Integer>> set = new HashSet<>();
		Arrays.sort(nums);
		Integer sta = null;
		int length = nums.length;
		for(int i = 0;i<length;i++){
			if(sta!= null && sta == nums[0]){
				nums = Arrays.copyOfRange(nums, 1, nums.length);
				continue;
			}
			sta = nums[0];
			nums = Arrays.copyOfRange(nums, 1, nums.length);
			int left = 0, right = nums.length - 1;
			while(left < right){
				if(nums[left]+nums[right] == -sta){
					value = new ArrayList<>();
					value.add(sta);
					value.add(nums[left]);
					value.add(nums[right]);
					set.add(value);
					left++;
					right--;
				}
				else if(nums[left]+nums[right] > - sta)
					right--;
				else
					left++;
			}
		}
		result = new ArrayList<>(set);
		return result;
	}
	
	public static void main(String[] args){
		int[] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
		System.out.println(threeSum(nums));
	}
}
