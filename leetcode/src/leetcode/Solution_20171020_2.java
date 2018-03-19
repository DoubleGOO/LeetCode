package leetcode;
//145. Binary Tree Postorder Traversal
//https://leetcode.com/problems/binary-tree-postorder-traversal/description/
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.Solution_20171019_1.TreeNode;

public class Solution_20171020_2 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode pre = null;//上次访问的树
        while(!s.isEmpty()||root!=null){
        	while(root!=null){
            	s.push(root);
            	root=root.left;
            }
        	root = s.peek();
        	if(pre==root.right){
        		result.add(root.val);
        		pre=s.pop();
        		root=null;
        	}else{
        		root = root.right;
        		pre = root;
        	}
        }
        return result;
    }
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
//		t1.right = t2;
//		t2.left = t3;
		System.out.println(postorderTraversal(t1));
	}
}
