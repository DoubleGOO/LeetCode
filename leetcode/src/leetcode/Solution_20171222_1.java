package leetcode;

import java.util.ArrayList;
import java.util.Iterator;

//155. Min Stack
//https://leetcode.com/problems/min-stack/description/
public class Solution_20171222_1 {
	class MinStack {
		public ArrayList<Integer> al; 
		public int min;
		public int position;
		
	    public MinStack() {
	        al = new ArrayList<>();
	        min = Integer.MAX_VALUE;
	        position = -1;
	    }
	    
	    public void push(int x) {
	        al.add(x);
	        position++;
	    }
	    
	    public void pop() {
	        al.remove(position);
	        position--;
	    }
	    
	    public int top() {
	        return al.get(position);
	    }
	    
	    public int getMin() {
	        Iterator<Integer>  i = al.iterator();
	        min = Integer.MAX_VALUE;
	        while(i.hasNext()){
	        	int value = i.next();
	        	min = (value<min)?value:min;
	        }
	        return min;
	    }
	}
}
