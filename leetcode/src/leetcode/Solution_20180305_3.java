package leetcode;
//21. Merge Two Sorted Lists
//https://leetcode.com/problems/merge-two-sorted-lists/description/
public class Solution_20180305_3 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l = new ListNode(0);
		ListNode result = l;
        while(l1 != null && l2 != null){
        	if(l1.val < l2.val){
        		l.next = l1;
        		l1 = l1.next;
        	}
        	else{
        		l.next = l2;
        		l2 = l2.next;
        	}
        	l = l.next;
        }
        if(l1 == null)
        	l.next = l2;
        else
        	l.next = l1;
        return result.next;
    }
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(3);
		ListNode l6 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l4.next = l5;
		l5.next = l6;
		mergeTwoLists(l1,l4);
	}
}
