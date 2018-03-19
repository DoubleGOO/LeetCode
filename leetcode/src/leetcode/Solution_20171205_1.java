package leetcode;

public class Solution_20171205_1 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
	public TreeNode invertTree(TreeNode root){
		if(root == null)
			return root;
		helper(root);
		return root;
	}
	public static void helper(TreeNode root){
		TreeNode temp;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		if(root.left != null)
			helper(root.left);
		if(root.right != null)
			helper(root.right);
	}
	public static void main(String[] args) {
		
	}
}
