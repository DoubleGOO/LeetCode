package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-level-order-traversal/description/
//102. Binary Tree Level Order Traversal
public class Solution_20171009_1 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
	public static List<List<Integer>> levelOrder(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		List<List<Integer>> result = new ArrayList<>();
		if(root == null)
			return result;
		List<Integer> l = new ArrayList<>();
		l.add(root.val);
		result.add(l);
		q.offer(root);
		int count = 2;
		int yes = 0;
		int no = 0;
		l = new ArrayList<>();
		while(!q.isEmpty()){
			TreeNode tn = q.poll();
			if(tn.left!=null){
				l.add(tn.left.val);
				q.offer(tn.left);
				yes++;
			}else{
				no ++;
			}
			if(tn.right!=null){
				l.add(tn.right.val);
				q.offer(tn.right);
				yes++;
			}else{
				no ++;
			}
			if((yes+no) == count&&yes!=0){
				result.add(l);
				l = new ArrayList<>();
				count *= 2;
				yes = 0;
				no *= 2;
			}
		}
		return result;
	}
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.left = t2;
		t2.left = t3;
		t3.left = t4;
		t4.left = t5;
		System.out.println(levelOrder(t1));

	}
}
