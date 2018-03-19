package leetcode;
//148. Sort List
//https://leetcode.com/problems/sort-list/description/
import java.util.Arrays;

public class Solution_20171116_1 {
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
	//time exceeded
	public static ListNode sortList(ListNode head){
		int length = 0;	
		ListNode ptemp = head;
		ListNode phead = head;
		ListNode ptail = null;
		ListNode ppre = null;
		if(head == null)
			return null;
		while(head!=null){
			head = head.next;
			length++;
		}
		head = phead;
		int[] table = new int[length];
		length = 0;
		while(head!=null){
			table[length++] = head.val;
			ppre = head;
			head = head.next;
		}
		ppre.next = phead;
		Arrays.sort(table);
		phead = null;
		int position = 0;
		while(position<length){
			if(phead == null){
				while(ptemp.val != table[position])
					ptemp = ptemp.next;
				phead = ptemp;
				ptail = phead;
				position++;
				continue;
			}
			ppre = ptail;
			ptemp = ptail.next;
			while(ptemp.val != table[position]){
				ppre = ptemp;
				ptemp = ptemp.next;	
			}
			position++;
			if(ptail.next != ptemp){
				ppre.next = ptemp.next;
				ptemp.next = ptail.next;
				ptail.next = ptemp;
			}
			ptail = ptemp;
		}
		ptail.next = null;
		return phead;
	}
	
	public static void main(String[] args){
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(4);
//		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
//		l3.next = l4;
		System.out.println(sortList(l1));
	}
}
