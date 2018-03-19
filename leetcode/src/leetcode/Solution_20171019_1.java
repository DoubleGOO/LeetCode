package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_20171019_1 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static List<Integer> inorderTraveral(TreeNode root){
		Stack<TreeNode> s = new Stack<>();
		List<Integer> l = new ArrayList<>();
		if(root == null){
			return l;
		}
		s.push(root);
		while(!s.isEmpty()){
			TreeNode tn = s.peek();
			if(tn.left!=null){
				s.push(tn.left);
				tn.left=null;
			}else{
				s.pop();
				l.add(tn.val);
				if(tn.right!=null)
					s.push(tn.right);
			}
		}
		return l;
	}
	public static List<Integer> inorderTraveral_standar(TreeNode root){
		Stack<TreeNode> s = new Stack<>();
		List<Integer> l = new ArrayList<>();
		while(!s.isEmpty()||root!=null){
			while(root!=null){
				s.push(root);
				root = root.left;
			}
			TreeNode tn = s.pop();
			l.add(tn.val);
			root = tn.right;
		}
		return l;
	}
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t1.right = t2;
		t2.left = t3;
		System.out.println(inorderTraveral_standar(t1));
	}
}
