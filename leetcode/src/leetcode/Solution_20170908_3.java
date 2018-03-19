package leetcode;
import java.util.Arrays;
//169. Majority Element
//https://leetcode.com/problems/majority-element/description/
import java.util.Hashtable;
public class Solution_20170908_3 {
	public static int majorityElement(int[] nums){
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		Integer temp = 0;
		if(nums.length == 1) return nums[0];
		for(int i = 0;i<nums.length;i++){
			temp = table.get(nums[i]);
			if(temp == null) table.put(nums[i], 1);
			else {
				int tem = table.get(nums[i])+1;
				table.put(nums[i], tem);
				if(tem == nums.length/2+1) return nums[i];
			}
		}
		return 0;
	}
	public static int majorityElement_standar(int[] nums){
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	public static void main(String[] args){
		int[] nums = {1,2,2,1,3,2,4,2,2,2};
		System.out.println(majorityElement(nums));
	}
}
