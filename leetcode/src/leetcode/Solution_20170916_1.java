package leetcode;

import java.util.Arrays;
import java.util.HashMap;

//525. Contiguous Array
//https://leetcode.com/problems/contiguous-array/description/
public class Solution_20170916_1 {
	public static int findMaxLength(int[] nums){
		int max = 0;
		for(int j = 0;j<nums.length-max;j++){
			int max_temp = 0;
			int[] temp = Arrays.copyOfRange(nums, j, nums.length);
			int[] table = new int[2];
			for(int i = 0;i<temp.length;i++){
				if(temp[i]==1)
					table[1]++;
				else
					table[0]++;
				if(table[0]==table[1]){
					max_temp = table[0]*2;
				}
			}
			if(max_temp>max)
				max = max_temp;
		}
		return max;
	}
	public static int findMaxLength_standar(int[] nums){
		for(int i = 0;i<nums.length;i++){
			if(nums[i]==0) nums[i] = -1;
		}
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(0, -1);
		int sum = 0, max = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];
			if(map.containsKey(sum)){
				max = Math.max(max, i - map.get(sum));
			}
			else
				map.put(sum, i);
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,0,1,0,0,1};
		System.out.println(findMaxLength(nums));
	}

}
