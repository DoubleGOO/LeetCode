package leetcode;
import java.util.HashSet;
//Remove Duplicates from Sorted Array
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class Solution_20170906_2 {
	public static int removeDuplicates(int[] digits){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0;i<digits.length;i++){
			if(!set.contains(digits[i])){
				set.add(digits[i]);
			}
		}
		return set.size();
	}
	public static void main(String[] args){
		int[] digits = {1,1,2};
		System.out.println(removeDuplicates(digits));
	}
}
