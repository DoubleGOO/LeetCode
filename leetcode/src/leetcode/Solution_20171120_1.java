package leetcode;
//Linked List Cycle II
//https://leetcode.com/problems/linked-list-cycle-ii/description/
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}
public class Solution_20171120_1 {
	public static ListNode detectCycle(ListNode head){
		ListNode p1 = head;
		ListNode p2 = head;
		while(p2 != null){
			p2 = p2.next;
			if(p2 == null) return null;
			p2 = p2.next;
			p1 = p1.next;
			if(p2 == p1){
				break;
			}
		}
		if(p2 == null) return null;
		p2 = head;
		while(p2 != p1){
			p2 = p2.next;
			p1 = p1.next;
		}
		return p2;
	}
	
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l1;
		
		detectCycle(l1);
	}
}
