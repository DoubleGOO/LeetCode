package leetcode;
//19. Remove Nth Node From End of List
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class Solution_20180308_1 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static ListNode removeNthFromEnd(ListNode head, int n){
		ListNode headNode = head;
		ListNode delNode = head;
		while(headNode != null){
			if(n-- < 0){
				delNode = delNode.next;
			}
			headNode = headNode.next;
		}
		if(n == 0)
			return delNode.next;
		delNode.next = delNode.next.next;
		return head;
	}
	public static void main(String[] args) {
		
	}
}
