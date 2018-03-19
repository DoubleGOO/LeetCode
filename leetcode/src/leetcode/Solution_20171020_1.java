package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.Solution_20171019_1.TreeNode;

//144. Binary Tree Preorder Traversal
//https://leetcode.com/problems/binary-tree-preorder-traversal/description/
public class Solution_20171020_1 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public List<Integer> preorderTraversal(TreeNode root){
		Stack<TreeNode> s = new Stack<>();
		List<Integer> result = new ArrayList<>();
		while(!s.isEmpty()||root!=null){
			if(root!=null)
				result.add(root.val);
			else{
				root = s.pop();
				result.add(root.val);
			}
			if(root.right != null)
				s.push(root.right);
			root = root.left;
		}
		return result;
	}
}
