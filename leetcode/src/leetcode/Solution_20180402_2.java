package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//½£Ö¸
public class Solution_20180402_2 {
	//5
//	Stack<Integer> stack1 = new Stack<Integer>();
//    Stack<Integer> stack2 = new Stack<Integer>();
//    
//    public void push(int node) {
//        stack1.push(node);
//    }
//    
//    public int pop() {
//    	if(stack2.isEmpty()){
//    		while(stack1.isEmpty()!=true){
//    			stack2.push(stack1.pop());
//    		}
//    	}
//    	return stack2.pop();
//    }
	//6
//	public int minNumberInRotateArray(int [] array) {
//		if(array.length == 0)
//			return 0;
//	    int min = Integer.MAX_VALUE;
//	    for(int i:array){
//	    	min= (i<min?i:min);
//	    }
//	    return min;
//    }
	//7
//	public int Fibonacci(int n) {
//		if(n <= 0)
//			return 0;
//		if(n<2)
//			return 1;
//		return Fibonacci(n-1)+Fibonacci(n-2);
//    }
	//8
//	public int JumpFloor(int target) {
//		if(target == 1)
//			return 1;
//		if(target == 2)
//			return 2;
//		int[] dp = new int[target];
//		dp[0] = 1;
//		dp[1] = 2;
//		for(int i = 2;i<target;i++){
//			dp[i] = dp[i-1] + dp[i-2];
//		}
//		return dp[target-1];
//    }
	//9
//	public int JumpFloorII(int target) {
//		if(target == 1)
//			return 1;
//		if(target == 2)
//			return 2;
//		int[] dp = new int[target];
//		dp[0] = 1;
//		dp[1] = 2;
//		for(int i = 2;i<target;i++){
//			int sum = 0;
//			for(int j = 0;j<i;j++){
//				sum = sum + dp[j]; 
//			}
//			dp[i] = sum + 1;
//		}
//		
//		return dp[target -1 ];
//	}
	//10
//	public int RectCover(int target) {
//		if(target <= 2)
//			return target;
//		int[] dp = new int[target];
//		dp[0] = 1;
//		dp[1] = 2;
//		for(int i = 2;i<target;i++){
//			dp[i] = dp[i-1] + dp[i-2];
//		}
//		return dp[target-1];
//    }
	//11
	public int NumberOf1(int n){
        int index = 1;
        int number = 0;
     
	    while(index!=0){
	        if((n & index)!=0)
	            number++;
	        index = index << 1;
	    }
    	return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
}
//1
//public boolean Find(int target, int [][] array) {
//	for(int[] i:array){
//		for(int j:i){
//			if(j==target)
//				return true;
//		}
//	}
//	return false;
//}
//2
//public String replaceSpace(StringBuffer str) {
//	String cs = str.toString();
//	return cs.replaceAll(" ", "%20");
//}
//3
//public class ListNode {
//	int val;
//	ListNode next = null;
//
//	ListNode(int val) {
//		this.val = val;
//	}
//}
//public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//	ArrayList<Integer> al = new ArrayList<>();
//    while(listNode != null){
//    	al.add(listNode.val);
//    	listNode = listNode.next;
//    }
//    int left = 0;
//    int right = al.size()-1;
//    while(left<right){
//    	int temp = al.get(left);
//    	al.set(left, al.get(right));
//    	al.set(right, temp);
//    	left ++ ;
//    	right --;
//    }
//    return al;
//}
//4
//public static class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}
//
//public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//	TreeNode t = helper(pre,in);
//	return t;
//}
//public static TreeNode helper(int [] pre,int [] in){
//	if(pre == null){
//		return null;
//	}
//	int root = pre[0];
//	TreeNode t = new TreeNode(root);
//	
//	int length = pre.length;
//	int insert = 0;
//	for(int i = 0;i<in.length;i++){
//		if(root == in[i]){
//			insert = i;
//			break;
//		}
//	}
//	int[] leftPre = null;
//	int[] leftIn = null;
//	int[] rightPre = null;
//	int[] rightIn = null;
//	if(insert > 0){
//		leftPre = Arrays.copyOfRange(pre, 1, 1 + insert);
//		leftIn = Arrays.copyOfRange(in, 0, insert);	
//	}
//	if(insert < length -1){
//		rightPre = Arrays.copyOfRange(pre, insert + 1, length);
//		rightIn = Arrays.copyOfRange(in, insert + 1, length);
//	}
//	t.left = helper(leftPre,leftIn);
//	t.right = helper(rightPre,rightIn);
//	return t;
//}
