package leetcode;

import java.util.Arrays;

//108. Convert Sorted Array to Binary Search Tree
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
public class Solution_20171206_1 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x; }
	}
	public TreeNode sortedArrayToBST(int[] nums){
		int length = nums.length;
		if(length == 0)
			return null;
		TreeNode root = new TreeNode(nums[(length-1)/2]);
		int[] numsLeft = Arrays.copyOfRange(nums, 0, (length-1)/2);
		int[] numsRight = Arrays.copyOfRange(nums, (length-1)/2+1, length );
		root.left = sortedArrayToBST(numsLeft);
		root.right = sortedArrayToBST(numsRight);
		return root;
	}
	public static void main(String[] args) {
		
	}
}
