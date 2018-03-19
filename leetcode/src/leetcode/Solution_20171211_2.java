package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//406. Queue Reconstruction by Height
//https://leetcode.com/problems/queue-reconstruction-by-height/description/
public class Solution_20171211_2 {
	/************************wrong answer************************/
	public static int[][] reconstructQueue(int[][] people){
		quickSort(people,0,people.length-1);
		ArrayList<int[]> result = new ArrayList<>();
		for(int i = 0;i<people.length;i++){
			result.add(people[i][1], people[i]);
		}
		int[][] answer = people;
		for(int i = 0;i<people.length;i++){
			answer[i] = result.get(i);
		}
		return answer;
	}
	public static void quickSort(int[][] people,int left,int right){//用平均查找最快的快速排序
		int i,j;
		int[] temp;
		if(left>right)
			return;
		temp = people[left];
		i = left;
		j = right;
		while(i < j){
			while((people[j][0]<temp[0]||(people[j][0]==temp[0]&&people[j][1]>=temp[1]))&&i<j){
				j--;
			}	
			while((people[i][0]>temp[0]||(people[i][0]==temp[0]&&people[i][1]<=temp[1]))&&i<j){
				i++;
			}
			if(i<j){
				int[] helper = people[i];
				people[i] = people[j];
				people[j] = helper;
			}
		}
		people[left] = people[i];
		people[i] = temp;
		quickSort(people,left,i-1);
		quickSort(people,i+1,right);
	}
	public static void main(String[] args) {
		int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		reconstructQueue(people);
	}
}
