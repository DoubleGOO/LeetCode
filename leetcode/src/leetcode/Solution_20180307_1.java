package leetcode;
//2. Add Two Numbers
//https://leetcode.com/problems/add-two-numbers/description/
public class Solution_20180307_1 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = 0, aCount = 0;
        int b = 0, bCount = 0;
        int c = 0;
        while(l1 != null){
        	a = (int) (a + (l1.val)*Math.pow(10, aCount));
        	l1 = l1.next;
        	aCount++;
        }
        while(l2 != null){
        	b = (int) (b + (l2.val)*Math.pow(10, bCount));
        	l2 = l2.next;
        	bCount++;
        }
        c = a + b;
        ListNode result = new ListNode(0);
        ListNode answer = result;
        if(c==0)
            return answer;
        while(c != 0){
        	result.next = new ListNode(c%10);
        	c = c/10;
        	result = result.next;
        }
        return answer.next;
    }
	public static void main(String[] args){
		System.out.println(Integer.MAX_VALUE);
	}
}
