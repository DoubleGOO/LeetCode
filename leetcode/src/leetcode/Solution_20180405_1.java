package leetcode;

public class Solution_20180405_1 {
	//14
//	
//	public class ListNode {
//	    int val;
//	    ListNode next = null;
//
//	    ListNode(int val) {
//	        this.val = val;
//	    }
//	}
//	
//	public ListNode FindKthToTail(ListNode head,int k) {
//		if(head == null || k<=0)
//			return null;
//		ListNode first = head;
//		ListNode second = head;
//		while(--k!=0||first!=null){
//			first = first.next;
//		}
//		if(first == null)
//			return null;
//		while(first.next != null){
//			first = first.next;
//			second = second.next;
//		}
//		return second;
//    }
	//15
//	public class ListNode {
//	    int val;
//	    ListNode next = null;
//
//	    ListNode(int val) {
//	        this.val = val;
//	    }
//	}
//	
//	public ListNode ReverseList(ListNode head) {
//		if(head == null || head.next == null)
//			return head;
//		ListNode l1 = head;
//		ListNode l2 = l1.next;
//		ListNode l3 = l2.next;
//	
//		while(l3 != null){
//			l2.next = l1;
//			l1 = l2;
//			l2 = l3;
//			l3 = l3.next;
//		}
//		l2.next = l1;
//		head.next = null;
//		return l2;	
//    }
	//16
//	public static class ListNode {
//		int val;
//    	ListNode next = null;
//
//    	ListNode(int val) {
//        	this.val = val;
//    	}
//	}
//	public static ListNode Merge(ListNode list1,ListNode list2) {
//		if(list1 == null)
//			return list2;
//		if(list2 == null)
//			return list1;
//		ListNode list = new ListNode(0);
//		ListNode listPre = list;
//		ListNode listHead = list;
//		ListNode l1 = list1;
//		ListNode l2 = list2;
//		while(l1!=null&&l2!=null){
//			list.next = new ListNode(0);
//			if(l1.val < l2.val){
//				list.val = l1.val;
//				l1 = l1.next;
//			}
//			else{ 
//				list.val = l2.val;
//				l2 = l2.next;
//			}
//			listPre = list;
//			list = list.next;
//		}
//		if(l1==null)
//			listPre.next = l2;
//		else
//			listPre.next = l1;
//		return listHead;
//    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
