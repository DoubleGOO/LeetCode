package leetcode;

import java.util.Stack;
import java.util.Vector;

//20. Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/description/
public class Solution_20180208_1 {
	public static boolean isValid(String s){
		Stack<Character> stack = new Stack<>();
		for(char c:s.toCharArray()){
			switch(c){
			case '(':stack.push(c);break;
			case '[':stack.push(c);break;
			case '{':stack.push(c);break;
			case ')':if(stack.isEmpty()||stack.pop()!='(') return false;break;
			case ']':if(stack.isEmpty()||stack.pop()!='[') return false;break;
			case '}':if(stack.isEmpty()||stack.pop()!='{') return false;break;
			}
		}
		if(stack.isEmpty())
			return true;
		return false;
	}
	public static void main(String[] args) {
		
	}
}
