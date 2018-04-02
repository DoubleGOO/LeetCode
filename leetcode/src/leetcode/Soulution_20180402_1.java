package leetcode;

import java.util.Arrays;

//215. Kth Largest Element in an Array
//https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class Soulution_20180402_1 {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
