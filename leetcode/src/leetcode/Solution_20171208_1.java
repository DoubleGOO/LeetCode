package leetcode;
//109. Convert Sorted List to Binary Search Tree
//https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/
public class Solution_20171208_1 {
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
	public static TreeNode sortedListToBST(ListNode head){
		return helper(head);
	}
	public static TreeNode helper(ListNode head){
		if(head == null)
			return null;
		TreeNode t = new TreeNode(head.val);
		if(head.next == null)
			return t;
		ListNode pre = head;
		ListNode slow = head;
		ListNode fast = head.next;
		while(fast != null){
			pre = slow;
			slow = slow.next;
			fast = fast.next;
			if(fast == null) break;
			fast = fast.next;
		}
		pre.next = null;
		t = new TreeNode(slow.val);
		t.left = helper(head);
		t.right = helper(slow.next);
		return t;
	}
	public static void main(String[] args) {
		ListNode l1 = new ListNode(-10);
		ListNode l2 = new ListNode(-3);
		ListNode l3 = new ListNode(0);
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(9);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		sortedListToBST(l1);
	}
}
