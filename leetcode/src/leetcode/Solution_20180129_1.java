package leetcode;
//3Sum Closest
//https://leetcode.com/submissions/detail/138455139/
import java.util.Arrays;

public class Solution_20180129_1 {
	public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        int result = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
        	left = i+1;
        	right = nums.length - 1;
        	while(left<right){
        		sum = nums[i] + nums[left] + nums[right];
        		int a = Math.abs(min - target);
        		int b = Math.abs(sum - target);
        		if(min > Math.abs(sum - target)){
        			min = Math.abs(sum - target);
        			result = sum;
        		}
        		if(sum > target){
        			right--;
        		}else if(sum < target){
        			left++;
        		}else{
        			return target;
        		}
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		int nums[] = {-3,-2,-5,3,-4};
		System.out.println(threeSumClosest(nums, -1));
		System.out.println(Integer.MAX_VALUE+1);
	}
}
