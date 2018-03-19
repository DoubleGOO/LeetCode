package leetcode;

public class Solution_20171129_1 {
	
	public static void sortColors(int[] nums){
		if(nums.length<2)
			return;
		int left = 0;
		int right = nums.length - 1;
		int position = 0;
		while(left < right&&position<=right){
			while(left<nums.length-1&&nums[left]==0)
				left++;
			while(right>0&&nums[right]==2)
				right--;
			if(left < right&&position<=right&&position>=left){}
			else {position++;continue;}
			if(nums[position]==0){
				nums[position] = nums[left];
				nums[left] = 0;
				position--;
			}else if(nums[position]==2){
				nums[position] = nums[right];
				nums[right] = 2;
				position--;
			}
			position++;
		}
	}
	
	public static void main(String[] args){
		int[] nums = {0,2,1};
		sortColors(nums);
		for(int i:nums)
			System.out.print(i);
	}	
}
