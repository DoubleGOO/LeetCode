package leetcode;


import java.util.Stack;


public class Solution_20171018_1 {
	class MyQueue {
		
		public Stack<Object> l; 
		
	    /** Initialize your data structure here. */
	    public MyQueue() {
	    	l = new Stack<>();
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        l.push(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	    	Stack<Object> temp = new Stack<Object>();
	    	Object o = null;
	    	while(!l.isEmpty()){
	    		o = l.pop();
	    		temp.push(o);
	    	}
	    	temp.pop();
	    	while(!temp.isEmpty()){
	    		Object oj = temp.pop();
	    		l.push(oj);
	    	}
	    	return (int)o;
	    }
	    
	    /** Get the front element. */
	    @SuppressWarnings("unchecked")
		public int peek() {
	    	Stack<Object> temp1 = (Stack<Object>)l.clone();
	    	Stack<Object> temp2 = new Stack<Object>();
	    	while(!temp1.isEmpty()){
	    		Object o = temp1.pop();
	    		temp2.push(o);
	    	}
	    	return (int)temp2.pop();
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        if(l.isEmpty())
	        	return true;
	        return false;
	    }
	    
	}
}
