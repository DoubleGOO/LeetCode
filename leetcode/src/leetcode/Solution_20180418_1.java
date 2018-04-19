package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

//从上往下打印二叉树

public class Solution_20180418_1 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {	
		ArrayList<Integer> al = new ArrayList<>();
		if(root == null)return al;
        LinkedList<TreeNode> l = new LinkedList<>(); 
        l.offer(root);
        while(!l.isEmpty()){
        	TreeNode t = l.poll();
        	al.add(t.val);
        	if(t.left!=null)
        		l.offer(t.left);
        	if(t.right!=null)
        		l.offer(t.right);
        }
        return al;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
