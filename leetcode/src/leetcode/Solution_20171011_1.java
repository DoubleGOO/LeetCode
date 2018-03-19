package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/course-schedule/description/
//207. Course Schedule
public class Solution_20171011_1 {
	public static boolean canFinish(int numCourses,int[][] prerequisites){
		ArrayList<Integer>[] al = new ArrayList[numCourses];
		int[] table = new int[numCourses];
		int count = 0;
		for(int i=0;i<numCourses;i++){
			table[i] = 0;
		}
		for(int[] temp:prerequisites){
			if(al[temp[0]]==null)
				al[temp[0]] = new ArrayList<>();
			al[temp[0]].add(temp[1]);
			table[temp[1]]++;
		}
		Queue<List> q = new LinkedList<>();
		for(int i=0;i<numCourses;i++){
			if(table[i]==0){
				q.offer(al[i]);
			}
		}
		while(!q.isEmpty()){
			List l = q.poll();
			count++;
			if(l==null)
				continue;
			for(int i = 0;i<l.size();i++){
				if(--table[(int) l.get(i)]==0)
					q.offer(al[(int) l.get(i)]);
			}
		}
		return count==numCourses?true:false;
	}
	public static void main(String[] args){
		int[][] num = {{1,0}};
		if(canFinish(2,num))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
