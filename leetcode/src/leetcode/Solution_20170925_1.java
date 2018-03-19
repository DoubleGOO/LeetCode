package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_20170925_1 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	
	public List<String> binaryTreePaths(TreeNode root){
		List<String> result = new ArrayList<>();
		StringBuffer sb = new StringBuffer("");
		if(root == null ) return result;
		dfs(result,root,sb);
		return result;
	}
	
	public void dfs(List<String> result,TreeNode root,StringBuffer sb){
		if(sb.length()==0)
			sb.append(root.val);
		else
			sb.append("->"+root.val);
		if(root.left == null && root.right == null){
			result.add(sb.toString());
		}
		if(root.left!=null) {
			dfs(result,root.left,new StringBuffer(sb));
		}
		if(root.right!=null){
			dfs(result,root.right,new StringBuffer(sb));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
