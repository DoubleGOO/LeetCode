package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Solution_20171013_2 {
	@SuppressWarnings("unchecked")
	public static List<List<Integer>> subsets(int[] nums){
		Set<List<Integer>> result = new HashSet<List<Integer>>();
		int index = 0;
		List<Integer> l = new ArrayList<>();;
		dfs(result,index,nums,l);
		@SuppressWarnings({ "rawtypes" })
		List res = new ArrayList(result);
		return res;
	}
	public static void dfs(Set<List<Integer>> result,int index,int[] nums,List<Integer> l){
		result.add(new ArrayList(l));
		for(int i = index;i<nums.length;i++){
			l.add(nums[i]);
			dfs(result,i+1,nums,l);
			l.remove(l.size()-1);
		}
	}
	public static void main(String[] args){
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}
}
