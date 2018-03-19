package leetcode;
//83. Remove Duplicates from Sorted List
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
public class Solution_20180306_1 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static ListNode deledeDuplicates(ListNode head){
		if(head == null){
			return head;
		}
		ListNode result = head;
		while(head != null){
			while(head.next != null && head.val == head.next.val){
				head.next = head.next.next;
			}
			head = head.next;
		}
		return result;
	}
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		l1.next = l2;
		deledeDuplicates(l1);
	}
}
