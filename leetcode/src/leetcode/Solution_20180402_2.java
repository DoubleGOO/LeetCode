package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

//½£Ö¸
public class Solution_20180402_2 {
	//1
//	public boolean Find(int target, int [][] array) {
//		for(int[] i:array){
//			for(int j:i){
//				if(j==target)
//					return true;
//			}
//		}
//		return false;
//    }
	//2
//	public String replaceSpace(StringBuffer str) {
//		String cs = str.toString();
//		return cs.replaceAll(" ", "%20");
//    }
	//3
//	public class ListNode {
//		int val;
//		ListNode next = null;
//	
//		ListNode(int val) {
//			this.val = val;
//		}
//	}
//	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//		ArrayList<Integer> al = new ArrayList<>();
//        while(listNode != null){
//        	al.add(listNode.val);
//        	listNode = listNode.next;
//        }
//        int left = 0;
//        int right = al.size()-1;
//        while(left<right){
//        	int temp = al.get(left);
//        	al.set(left, al.get(right));
//        	al.set(right, temp);
//        	left ++ ;
//        	right --;
//        }
//        return al;
//    }
	//4
//	public static class TreeNode {
//	    int val;
//	    TreeNode left;
//	    TreeNode right;
//	    TreeNode(int x) { val = x; }
//	}
//	
//	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//		TreeNode t = helper(pre,in);
//		return t;
//    }
//	public static TreeNode helper(int [] pre,int [] in){
//		if(pre == null){
//			return null;
//		}
//		int root = pre[0];
//		TreeNode t = new TreeNode(root);
//		
//		int length = pre.length;
//		int insert = 0;
//		for(int i = 0;i<in.length;i++){
//			if(root == in[i]){
//				insert = i;
//				break;
//			}
//		}
//		int[] leftPre = null;
//		int[] leftIn = null;
//		int[] rightPre = null;
//		int[] rightIn = null;
//		if(insert > 0){
//			leftPre = Arrays.copyOfRange(pre, 1, 1 + insert);
//			leftIn = Arrays.copyOfRange(in, 0, insert);	
//		}
//		if(insert < length -1){
//			rightPre = Arrays.copyOfRange(pre, insert + 1, length);
//			rightIn = Arrays.copyOfRange(in, insert + 1, length);
//		}
//		t.left = helper(leftPre,leftIn);
//		t.right = helper(rightPre,rightIn);
//		return t;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
