package leetcode;
// 450. Delete Node in a BST
//https://leetcode.com/problems/delete-node-in-a-bst/description/
public class Solution_20171209_1 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
/******************************wrong answer*********************************/
//	public static TreeNode deleteNode(TreeNode root, int key) {
//		TreeNode result = root;
//		boolean flag = false;
//        while(root!=null){
//        	if(key < root.val){
//        		root = root.left;
//        		continue;
//        	}else if(key > root.val){
//        		root = root.right;
//        		continue;
//        	}
//        	flag = true;
//        }
//        if(!flag)return null;
//        TreeNode left = root.left, lastLeft = root.left;
//        TreeNode right = root.right, lastRight = root.right;
//        int leftCount = 0, rightCount = 0;
//        while(left!=null){
//        	lastLeft = left;
//        	left = left.right;
//        	leftCount++;
//        }
//        while(right!=null){
//        	lastRight = right;
//        	right = right.left;
//        	rightCount++;
//        }
//        if(leftCount > rightCount){
//        	root.val = lastLeft.val;
//        	if(lastLeft.left != null){
//        		lastLeft.val = lastLeft.left.val;
//        	}else{
//        		lastLeft = null;
//        	}
//        }else{
//        	root.val = lastRight.val;
//        	if(lastRight.right != null){
//        		lastRight.val = lastRight.right.val;
//        	}else{
//        		lastRight = null;
//        	}
//        }
//        return result;
//    }
	public static TreeNode deleteNode(TreeNode root, int key) {
	    if(root == null){
	        return null;
	    }
	    if(key < root.val){
	        root.left = deleteNode(root.left, key);
	    }else if(key > root.val){
	        root.right = deleteNode(root.right, key);
	    }else{
	        if(root.left == null){
	            return root.right;
	        }else if(root.right == null){
	            return root.left;
	        }
	        
	        TreeNode minNode = findMin(root.right);
	        root.val = minNode.val;
	        root.right = deleteNode(root.right, root.val);
	    }
	    return root;
	}

	private static TreeNode findMin(TreeNode node){
	    while(node.left != null){
	        node = node.left;
	    }
	    return node;
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(4);
		TreeNode t3 = new TreeNode(6);
		TreeNode t4 = new TreeNode(3);
		t1.left = t2;
		t1.right = t3;
		t2.left  = t4;
	}
}
