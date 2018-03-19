package leetcode;
import java.util.*;
//119. Pascal's Triangle II
//https://leetcode.com/problems/pascals-triangle-ii/description/
public class Solution_20170907_3 {
	public List<Integer> getRow(int rowIndex){
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0;i<rowIndex+1;i++){
			result.add(0, 1);
			for(int j = 1;j<i;j++ ){
				result.set(j, result.get(j)+result.get(j+1));
			}
		}
		return result;
	}
}
