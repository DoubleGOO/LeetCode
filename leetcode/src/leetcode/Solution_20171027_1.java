package leetcode;

public class Solution_20171027_1 {
	static class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) {
		 val = x;
		 next = null;
		}
	}
	public static boolean hasCycle(ListNode head) {
        ListNode  walker = head;
        ListNode  runner = head;
        head.val = 6;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
	
	public static void main(String[] args){
		ListNode h1 = new ListNode(1);
		ListNode h2 = new ListNode(2);
		ListNode h3 = new ListNode(3);
		ListNode h4 = new ListNode(4);
		ListNode h5 = new ListNode(5);
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		h4.next = h5;
		h5.next = h1;
		if(hasCycle(h1)) System.out.println("yes");
	}
}
