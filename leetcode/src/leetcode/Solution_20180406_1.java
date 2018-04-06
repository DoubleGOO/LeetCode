package leetcode;
//17
import java.util.LinkedList;
import java.util.Queue;

public class Solution_20180406_1 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root1==null || root2 == null)
			return false;
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode root = root1;
		queue.offer(root1);
		while(!queue.isEmpty()){
			root = queue.poll();
			if(helper(root,root2))
				return true;
			if(root.left != null)
				queue.offer(root.left);
			if(root.right != null)
				queue.offer(root.right);
		}
		return false;
    }
	
	public static boolean helper(TreeNode root1,TreeNode root2){
		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		return root1.val == root2.val && helper(root1.left,root2.left) && helper(root1.right,root2.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(8);
		TreeNode t2 = new TreeNode(8);
		TreeNode t3 = new TreeNode(7);
		TreeNode t4 = new TreeNode(9);
		TreeNode t5 = new TreeNode(3);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(7);
		
		TreeNode t8 = new TreeNode(8);
		TreeNode t9 = new TreeNode(9);
		TreeNode t10 = new TreeNode(2);
		
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t5.left = t6;
		t5.right = t7;
		
		t8.left = t9;
		t8.right = t10;
		
		if(HasSubtree(t1,t8))
			System.out.println("true");
		else
			System.out.println("false");
		
	}

}
