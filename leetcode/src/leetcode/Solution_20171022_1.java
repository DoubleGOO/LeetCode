package leetcode;

import java.util.Stack;

//456. 132 Pattern
//https://leetcode.com/problems/132-pattern/description/
public class Solution_20171022_1 {
	static class p{
		int max;
		int min;
		p(int min,int max){
			this.max = max;
			this.min = min;
		}
	}
	public static boolean find132pattern(int[] nums) {
        Stack<p> s = new Stack<>();
        for(int n:nums){
        	if(s.isEmpty()||n<s.peek().min){
        		s.push(new p(n,n));
        	}else if(n>s.peek().min&&n<s.peek().max){
        		return true;
        	}else if(n>s.peek().min){
        		p last = s.pop();
        		last.max = n;
        		while(!s.isEmpty()&&n>s.peek().max) s.pop();
        		if(!s.isEmpty()&&n>s.peek().min) return true;
        		s.push(last);
        	}
        }
        return false;
    }
	public static void main(String[] args){
		int[] temp = {1,0,1,-4,-3};
		if(find132pattern(temp))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
