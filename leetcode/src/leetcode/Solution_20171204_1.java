package leetcode;

//98. Validate Binary Search Tree
//https://leetcode.com/problems/validate-binary-search-tree/description/
public class Solution_20171204_1 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}
	public static boolean isValidBST(TreeNode root){
		return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
	}
	public static boolean helper(TreeNode root,long minVal,long maxVal){
		if(root==null) return true;
		if(root.val<=minVal||root.val>=maxVal) return false;
		return helper(root.left,minVal,root.val)&&helper(root.right,root.val,maxVal);
	}
	public static void main(String[] agrs){
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(1);
		TreeNode t3 = new TreeNode(5);
		TreeNode t4 = new TreeNode(0);
		TreeNode t5 = new TreeNode(2);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(6);
		TreeNode t8 = new TreeNode(3);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		t5.right = t8;
		if(isValidBST(t1))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
