package leetcode;

import java.util.LinkedList;
import java.util.Queue;
/*Æ¯ÁÁµÄÐ´·¨
public boolean isSymmetric(TreeNode root) {
    if(root==null) return true;
    return isMirror(root.left,root.right);
}
public boolean isMirror(TreeNode p, TreeNode q) {
    if(p==null && q==null) return true;
    if(p==null || q==null) return false;
    return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
}
*/
public class Solution_20171201_1 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
	public static boolean isSymmetric(TreeNode root){
		if(root == null)
			return true;
		Queue<TreeNode> q = new LinkedList<>();
		TreeNode tn = new TreeNode(0);
		q.offer(root);
		while(!q.isEmpty()){
			int length = q.size();
			int[] array = new int[length];
			for(int i = 0;i<length;i++){
				TreeNode temp = q.poll();
				array[i] = temp.val;
				if(temp == tn) continue;
				if(temp.left != null) q.offer(temp.left);
				else
					q.offer(tn);
				if(temp.right != null) q.offer(temp.right);
				else
					q.offer(tn);
			}
			if(!helper(array))
				return false;
		}
		return true;
	}
	public static boolean helper(int[] array){
		if(array.length <= 1)
			return true;
		if(array.length%2 != 0)
			return false;
		int left = 0;
		int right = array.length-1;
		while(left<right){
			if(array[left] != array[right])
				return false;
			left++;right--;
		}
		return true;
	}
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(3);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		if(isSymmetric(t1))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
