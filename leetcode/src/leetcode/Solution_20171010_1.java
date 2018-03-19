package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.Solution_20171009_1.TreeNode;

//103. Binary Tree Zigzag Level Order Traversal
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
public class Solution_20171010_1 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
	public List<List<Integer>> zigzagLevelOrder(TreeNode root){
		Queue<TreeNode> q = new LinkedList<>();
		List<List<Integer>> result = new ArrayList<>();
		if(root == null)
			return result;
		q.offer(root);
		boolean flag = false;
		while(!q.isEmpty()){
			int size = q.size();
			List<Integer> l = new ArrayList<>();
			for(int i = 0;i<size;i++){
				TreeNode tn = q.poll();
				if(tn.left!=null){
					q.offer(tn.left);
				}
				if(tn.right!=null){
					q.offer(tn.right);
				}
				l.add(tn.val);
			}
			if(flag){
				Collections.reverse(l);
			}
			flag = !flag;
			result.add(l);
		}
		return result;
	}
}
