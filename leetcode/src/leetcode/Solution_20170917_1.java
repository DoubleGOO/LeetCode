package leetcode;
import java.util.HashMap;
//447. Number of Boomerangs
//https://leetcode.com/problems/number-of-boomerangs/description/
public class Solution_20170917_1 {
	public static int numberOfBoomerangs(int[][] points){
		int res = 0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();	
		for(int i = 0;i<points.length;i++){
			for(int j = 0;j<points.length;j++){
				if(i==j)
					continue;
				int distance = getDistance(points[i],points[j]);
				map.put(distance, map.getOrDefault(distance, 0)+1);
			}
			
			for(int value:map.values()){
				res += value*(value-1);
			}
			map.clear();
		}
		return res;
	}
	public static int getDistance(int[] x,int[] y){
		return (x[0]-y[0])*(x[0]-y[0])+(x[1]-y[1])*(x[1]-y[1]);
	}
	public static void main(String[] args){
		int[][] i = {{0,0},{1,0},{2,0}};
		System.out.println(numberOfBoomerangs(i));
	}
}
