package leetcode;
import java.util.*;
//118. Pascal's Triangle
//https://leetcode.com/problems/pascals-triangle/description/
public class Solution_20170907_2 {
	public static List<List<Integer>> generate(int numRows){
		List<List<Integer>> list_1 = new ArrayList<List<Integer>>();	
		List<Integer> tempList = new ArrayList<Integer>();
		int tempNum = 0;
		for(int i = 0;i<numRows;i++){
			List<Integer> list_2 = new ArrayList<Integer>();
			list_2.add(1);
			for(int j = 1;j<i;j++){
				tempList = list_1.get(i-1);
				tempNum = tempList.get(j)+tempList.get(j-1);
				list_2.add(j, tempNum);
			}
			list_2.add(1);
			if(i == 0) list_2.remove(1);
			list_1.add(list_2);
		}
		return list_1;
	}
	public static List<List<Integer>> generate_standar(int numRows){
		List<List<Integer>> list_1 = new ArrayList<List<Integer>>();
		List<Integer> list_2 = new ArrayList<Integer>();
		for(int i = 0;i<numRows;i++){
			list_2.add(0,1);
			for(int j = 1;j<i;j++){
				list_2.set(j, list_2.get(j)+list_2.get(j+1));
			}
			list_1.add(new ArrayList<Integer>(list_2));
		}
		return list_1;
	}
	public static void main(String[] args){
		System.out.println(generate_standar(15));
	}
}
