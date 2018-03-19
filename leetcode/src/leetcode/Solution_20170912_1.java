package leetcode;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//539. Minimum Time Difference
//https://leetcode.com/problems/minimum-time-difference/description/
public class Solution_20170912_1 {
	public static int findMinDifference(List<String> timePoints){
		List<Integer> list_min = new ArrayList<Integer>();
		int temp_1,temp_2;
		for(int i = 0;i<timePoints.size();i++){
			temp_1 = Integer.parseInt(timePoints.get(i).substring(0, 2));
			temp_2 = Integer.parseInt(timePoints.get(i).substring(3, 5));
			list_min.add(temp_1*60+temp_2);
		}
		Collections.sort(list_min);
		int min = (list_min.get(0)+1440-list_min.get(list_min.size()-1));
		for(int i = 1;i<list_min.size();i++){
			if(list_min.get(i)-list_min.get(i-1)<min){
				min = list_min.get(i)-list_min.get(i-1);
			}
		}
		return min;
	}
	public static void main(String args[]){
		List<String> test = new ArrayList<String>();
		test.add("23:59");
		test.add("00:00");
		test.add("01:02");
		System.out.println(findMinDifference(test));
	}
}
