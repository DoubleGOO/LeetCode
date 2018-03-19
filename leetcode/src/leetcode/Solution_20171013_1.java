package leetcode;

public class Solution_20171013_1 {
	public int[] singleNumber(int[] nums){
		int AxorB = 0;
		for(int num:nums){
			AxorB = AxorB ^ num;
		}
		int bitFlag = AxorB & ~(AxorB - 1);
		int[] result = new int[2];
		for(int num:nums){
			if((num & bitFlag) == 0)
				result[0] ^= num;
			else
				result[1] ^= num;
		}
		return result;
	}

}
