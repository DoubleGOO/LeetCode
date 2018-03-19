package leetcode;
//283. Move Zeroes
//https://leetcode.com/problems/move-zeroes/description/
public class Solution_20170908_1 {
	public static void moveZeroes(int[] nums){
		int temp = 0;
		outloop:
		for(int i = 0;i<nums.length;i++){
			int j = i;
			while(nums[j] == 0){
				if(++j == nums.length) break outloop; 
			}
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}
	public static void moveZeroes_standar(int[] nums){
		int left = 0, right = 0;
		for(right = 0;right<nums.length;right++){
			if(nums[right] != 0){
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;
				left++;
			}
		}
	}
	public static void main(String[] args){
		int[] nums = {0,1,0,3,12};
		moveZeroes_standar(nums);
		for(int i:nums){
			System.out.println(i);
		}
	}
}
