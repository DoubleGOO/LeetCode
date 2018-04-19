package leetcode;

import java.util.Stack;

public class Solution_20180417_1 {
	
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> s = new Stack<>();
		int pointerA = 0;
		int pointerB = 0;
		while(pointerA<pushA.length){
			if(!s.isEmpty()&&s.peek()==popA[pointerB]){
				s.pop();
				pointerB++;
				continue;
			}
			s.push(pushA[pointerA]);
			pointerA++;
		}
		while(pointerB<popA.length){
			if(!s.isEmpty()&&s.peek()==popA[pointerB]){
				s.pop();
				pointerB++;
				continue;
			}
			return false;
		}
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,3,5,1,2};
		if(IsPopOrder(pushA,popA)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
