package leetcode;
//462. Minimum Moves to Equal Array Elements II
//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/description/
import java.util.Arrays;

public class Solution_20171002_2 {
	public static int minMoves2(int[] nums){
		if(nums == null||nums.length==1)
			return 0;
		Arrays.sort(nums);
		int middle;
		if(nums.length%2==0)
			middle = (nums[nums.length/2-1]+nums[nums.length/2])/2;
		else
			middle = nums[nums.length/2];
		int result = 0;
		for(int temp:nums){
			result += (Math.abs(middle-temp));
		}
		return result;
	}
	public static int minMoves2_standar(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        int count = 0;
        while(i < j){
            count += nums[j]-nums[i];
            i++;
            j--;
        }
        return count;
    }
	public static void main(String[] args){
		
	}
}
