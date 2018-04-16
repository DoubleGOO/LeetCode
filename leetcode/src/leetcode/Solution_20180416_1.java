package leetcode;

import java.util.Stack;

public class Solution_20180416_1 {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
    public void push(int node) {
        if(s2.isEmpty()){
        	s2.push(node);
        }else{
        	if(s2.peek()>=node){
        		s2.push(node);
        	}
        }
        s1.push(node);
    }
    
    public void pop() {
        if(s1.peek() == s2.peek()){
        	s2.pop();
        }
    	s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int min() {
    	return s2.peek();
    }
    
    public static void main(String[] args) {
		
	}
}
