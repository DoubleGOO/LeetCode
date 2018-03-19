package leetcode;
import java.util.*;
//448. Find All Numbers Disappeared in an Array
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class Solution_20170906_3 {
	public static List<Integer> findDisappearedNumbers(int[] nums){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0;i<nums.length;i++){
			set.add(nums[i]);
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i<=nums.length;i++){
			if(!set.contains(i)){
				list.add(i);
			}
		}
		return list;
	}
	public static List<Integer> findDisappearedNumbers_standar(int[] nums){
		List<Integer> list = new ArrayList<Integer>();
		int n = nums.length;
		for(int i=0;i<n;i++){
			nums[(nums[i]-1)%n]+=n;
		}
		for(int i=0;i<n;i++){
			if(nums[i]<=n)
				list.add(i+1);
		}
		return list;
	}
	public static void main(String[] args){
		int[] test = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers_standar(test));
	}
}
