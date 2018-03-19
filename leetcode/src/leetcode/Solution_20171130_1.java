package leetcode;
//110. Balanced Binary Tree
//https://leetcode.com/problems/balanced-binary-tree/description/
public class Solution_20171130_1 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x; }
	}
	/*从上往下判断，每个节点都做一次深度探查，时间复杂度为O(n^2)*/
	public static boolean isBalanced_up(TreeNode root){
		if(root == null)
			return true;
		int left = depth(root.left);
		int right = depth(root.right);
		return Math.abs(left-right)<2&&isBalanced_up(root.left)&&isBalanced_up(root.right);
	}
	public static int depth(TreeNode root){
		if(root==null)
			return 0;
		return Math.max(depth(root.left),depth(root.right))+1;
	}
	/*从下往上判断，没有重复计算，遇到子树不平衡直接返回-1*/
	public boolean isBalanced_bottom(TreeNode root){
		return dfsHeight(root) != -1;
	}
	public int dfsHeight(TreeNode root){
        if (root == null) {
            return 0;
        }
        
        int left = dfsHeight(root.left);
        int right = dfsHeight(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
	public static void main(String[] main){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		t1.right = t2;
		if(isBalanced_up(t1))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
