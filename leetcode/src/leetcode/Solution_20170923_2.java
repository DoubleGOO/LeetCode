package leetcode;
//100. Same Tree
//https://leetcode.com/problems/same-tree/description/
public class Solution_20170923_2 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public boolean isSameTree(TreeNode p,TreeNode q){
		return dfs(p,q);
	}
	
	public boolean dfs(TreeNode p,TreeNode q){
		if(p == null && q == null)
			return true;
		if(p==null||q==null||p.val!=q.val)
			return false;
		if(!dfs(p.left,q.left)) return false;
		if(!dfs(p.right,q.right)) return false;
		return true;
	}
	
}
