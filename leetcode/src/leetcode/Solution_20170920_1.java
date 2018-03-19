package leetcode;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
//554. Brick Wall
//https://leetcode.com/problems/brick-wall/description/
public class Solution_20170920_1 {
	
	public static int leastBricks(List<List<Integer>> wall){
		HashMap<Integer,Integer> hm = new HashMap<>();
		int max = 0;
		for(int i = 0;i<wall.size();i++){
			List<Integer> al = wall.get(i);
			int sum = 0;
			for(int j = 0;j<al.size()-1;j++){
				sum = sum + al.get(j);
				hm.put(sum, hm.getOrDefault(sum, 0)+1);
				max = Math.max(max, hm.get(sum));
			}
		}
		
		return wall.size()-max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> wall = new ArrayList<List<Integer>>();
		List<Integer> temp1 = new ArrayList<Integer>();
		temp1.add(1);temp1.add(2);temp1.add(2);temp1.add(1);
		wall.add(temp1);
		List<Integer> temp2 = new ArrayList<Integer>();
		temp2.add(3);temp2.add(1);temp2.add(2);
		wall.add(temp2);
		List<Integer> temp3 = new ArrayList<Integer>();
		temp3.add(1);temp3.add(3);temp3.add(2);
		wall.add(temp3);
		List<Integer> temp4 = new ArrayList<Integer>();
		temp4.add(2);temp4.add(4);
		wall.add(temp4);
		List<Integer> temp5 = new ArrayList<Integer>();
		temp5.add(3);temp5.add(1);temp5.add(2);
		wall.add(temp5);
		List<Integer> temp6 = new ArrayList<Integer>();
		temp6.add(1);temp6.add(3);temp6.add(1);temp6.add(1);
		wall.add(temp6);
		System.out.println(leastBricks(wall));
	}

}
